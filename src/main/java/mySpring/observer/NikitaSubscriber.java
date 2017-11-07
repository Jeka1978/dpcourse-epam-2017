package mySpring.observer;

public class NikitaSubscriber implements Subscriber {
    @Override
    public void onNewPost(PostEvent postEvent) {
        System.out.println(postEvent.getPost().getAuthor().getName()+" не совсем прав...");
    }
}
