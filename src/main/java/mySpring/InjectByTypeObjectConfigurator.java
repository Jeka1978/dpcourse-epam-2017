package mySpring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class InjectByTypeObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type, field -> field.isAnnotationPresent(InjectByType.class));
        for (Field field : fields) {
            Object object = ObjectFactory.getInstance().createObject(field.getType());
            field.setAccessible(true);
            field.set(t,object);
        }
    }
}
