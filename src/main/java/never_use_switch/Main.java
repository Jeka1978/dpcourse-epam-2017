package never_use_switch;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        DataFactory dataFactory = new DataFactory();
        while (true) {
            String name = dataFactory.getName();
            int i = dataFactory.getNumberBetween(0, 2) + 1;
            MailInfo mailInfo = new MailInfo(new Client(name), i);
            mailSender.sendMail(mailInfo);
            Thread.sleep(1000);
        }
    }
}
