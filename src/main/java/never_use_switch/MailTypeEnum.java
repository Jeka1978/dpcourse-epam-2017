package never_use_switch;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@RequiredArgsConstructor
@Getter
public enum  MailTypeEnum {
    WELCOME(1, new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator());

    private final int dbCode;
    private final MailGenerator mailGenerator;



    public static MailTypeEnum findByDbCode(int dbCode) throws UnsupportedOperationException {
        MailTypeEnum[] enums = values();
        for (MailTypeEnum anEnum : enums) {
            if (anEnum.dbCode == dbCode) {
                return anEnum;
            }
        }
        throw new UnsupportedOperationException(dbCode + "not supported yet");
    }









}
