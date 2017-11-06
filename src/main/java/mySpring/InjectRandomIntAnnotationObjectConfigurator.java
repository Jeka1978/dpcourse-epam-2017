package mySpring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Set;

public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    private Random random = new Random();

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type, field -> field.isAnnotationPresent(InjectRandomInt.class));
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            int min = annotation.min();
            int max = annotation.max();

            int value = random.nextInt(max-min)+min;
            field.setAccessible(true);
            field.set(t, value);
        }
    }
}
