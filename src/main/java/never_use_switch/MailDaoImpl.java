package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MailDaoImpl implements MailDao {

   private DataFactory dataFactory = new DataFactory();

    @Override
    public MailInfo getMailInfo() {
        String name = dataFactory.getName();
        int i = dataFactory.getNumberBetween(0, 3) + 1;
        return new MailInfo(new Client(name), i);

    }
}
