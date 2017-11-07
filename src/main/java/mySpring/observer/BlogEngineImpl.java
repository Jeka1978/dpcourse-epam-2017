package mySpring.observer;

import mySpring.InjectByType;

import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDateTime.now;

public class BlogEngineImpl implements BlogEngine {
    @InjectByType
    private BroadCaster broadCaster;

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscribers(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    @Override
    public void removeSubscribers(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void publishPost(Post post) {
        broadCaster.broadCastPost(post);
        for (Subscriber subscriber : subscribers) {
            try {
                subscriber.onNewPost(new PostEvent(post, now()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}









