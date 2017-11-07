package mySpring.observer;

public class DenisSubscriber implements Subscriber {
    @Override
    public void onNewPost(PostEvent postEvent) {
        System.out.println("Денис читает "+postEvent.getPost().getContent());
    }
}
