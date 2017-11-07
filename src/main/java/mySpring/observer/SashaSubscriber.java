package mySpring.observer;

public class SashaSubscriber implements Subscriber {
    @Override
    public void onNewPost(PostEvent postEvent) {
        throw new RuntimeException("жесть!!!");
    }
}
