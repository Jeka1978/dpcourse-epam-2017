package mySpring;

public interface ProxyConfigurator {
    Object wrapWithProxy(Object t, Class type);
}
