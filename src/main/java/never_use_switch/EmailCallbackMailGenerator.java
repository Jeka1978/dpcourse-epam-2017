package never_use_switch;

import org.springframework.stereotype.Component;

@Component("2")
public class EmailCallbackMailGenerator implements MailGenerator {
    public String generateHtml(MailInfo mailInfo) {
        //50 lines of code
        return "don't call us we call you";
    }




}
