package mySpring;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class BenchmarkProxyConfigurator implements ProxyConfigurator {

    private BenchmarkToggle benchmarkToggle = new BenchmarkToggle();

    @Override
    public Object wrapWithProxy(Object t, Class type) {
        boolean hasBenchmarkMethods = Arrays.stream(type.getDeclaredMethods())
                .anyMatch(method -> method.isAnnotationPresent(Benchmark.class));

        if (type.isAnnotationPresent(Benchmark.class) || hasBenchmarkMethods) {
            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, new org.springframework.cglib.proxy.InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                        return BenchmarkProxyConfigurator.this.invoke(method, args, type, t);
                    }
                });
            } else {
                return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return BenchmarkProxyConfigurator.this.invoke(method, args, type, t);
                    }
                });
            }

        }
        return t;

    }

    private Object invoke(Method method, Object[] args, Class type, Object t) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if ((classMethod.isAnnotationPresent(Benchmark.class) || type.isAnnotationPresent(Benchmark.class)) && benchmarkToggle.isEnabled()) {
            System.out.println("************Benchmark*********");
            System.out.println(method.getName() + " started");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println(method.getName() + " finished");
            System.out.println("************Benchmark*********");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
