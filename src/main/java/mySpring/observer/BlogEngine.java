package mySpring.observer;

public interface BlogEngine {
    void addSubscribers(Subscriber subscriber);

    void removeSubscribers(Subscriber subscriber);

    void publishPost(Post post);
}
