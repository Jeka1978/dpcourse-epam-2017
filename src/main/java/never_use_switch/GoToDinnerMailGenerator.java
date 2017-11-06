package never_use_switch;

import org.springframework.stereotype.Component;

@Component("3")
public class GoToDinnerMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "пошли обедать!!!";
    }
}
