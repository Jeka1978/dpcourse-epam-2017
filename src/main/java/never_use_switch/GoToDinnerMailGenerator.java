package never_use_switch;

@MailCode(3)
public class GoToDinnerMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "пошли обедать!!!";
    }
}
