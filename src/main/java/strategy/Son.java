package strategy;

public class Son implements Mother, Father {
    @Override
    public void talkToSon() {
        Father.super.talkToSon();
        Mother.super.talkToSon();
    }
}
