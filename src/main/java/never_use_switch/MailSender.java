package never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MailSender {

    @Autowired
    private Map<String, MailGenerator> map;

    @Autowired
    private MailDao dao;



    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        MailInfo mailInfo = dao.getMailInfo();
        String mailCode = String.valueOf(mailInfo.getMailCode());
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