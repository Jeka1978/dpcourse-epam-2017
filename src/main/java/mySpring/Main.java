package mySpring;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);

        while (true) {
            iRobot.cleanRoom();
            Thread.sleep(1000);
        }

       /* EpamServiceImpl epamService = ObjectFactory.getInstance().createObject(EpamServiceImpl.class);
        System.out.println(epamService.getClass());
        epamService.doWork();
        epamService.drinkBeer();*/
    }
}
