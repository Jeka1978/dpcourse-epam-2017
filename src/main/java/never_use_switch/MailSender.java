package never_use_switch;

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        MailGenerator generator = MailTypeEnum.findByDbCode(mailCode).getMailGenerator();
        String html = generator.generateHtml(mailInfo);
        send(html);
    }

    private void send(String html) {
        System.out.println("sending... "+html);
    }
}
