package never_use_switch;

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        switch (mailCode) {
            case 1:
                // 60 lines of code
                System.out.println("sending mail WELCOME");
                break;
            case 2:
                // 50 lines of code
                System.out.println("don't call us we call you mail was sent");
                break;
            case 3:
        }
    }
}
