package never_use_switch;


import org.springframework.stereotype.Component;

@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    public String generateHtml(MailInfo mailInfo) {
        //50 lines of code
        return "<html> Welcome "+mailInfo.getClient().getName()+" !!!</html>";
    }


}
