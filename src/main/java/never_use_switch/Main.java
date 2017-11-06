package never_use_switch;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);

    }
}
