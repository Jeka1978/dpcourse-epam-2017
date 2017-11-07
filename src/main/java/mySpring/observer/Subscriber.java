package mySpring.observer;

public interface Subscriber {
    void onNewPost(PostEvent postEvent);
}
