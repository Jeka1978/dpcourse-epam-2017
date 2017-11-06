package never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MailSender {

    private Map<Integer, MailGenerator> map = new HashMap<>();
    private Reflections reflections = new Reflections("never_use_switch");

    @SneakyThrows
    public MailSender() {

        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);

        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                MailCode annotation = aClass.getAnnotation(MailCode.class);
                if (annotation == null) {
                    throw new RuntimeException("if you use MailGenerator you MUST annotated your class with @MailType");
                }
                int mailCode = annotation.value();
                if (map.containsKey(mailCode)) {
                    throw new RuntimeException(mailCode + " already in use");
                }

                map.put(mailCode, aClass.newInstance());
            }
        }
    }

    public void sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        MailGenerator generator = map.get(mailCode);
        if (generator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = generator.generateHtml(mailInfo);
        send(html);
    }

    private void send(String html) {
        System.out.println("sending... "+html);
    }
}
