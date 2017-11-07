package mySpring.observer;

import mySpring.ObjectFactory;

public class Main {
    public static void main(String[] args) {
        BlogEngine blogEngine = ObjectFactory.getInstance().createObject(BlogEngine.class);
        Post post = new Post(new Author("Alimenkou"), "jeeconf самая большая конференция на пост советском пространтве");

        blogEngine.addSubscribers(new DenisSubscriber());
        blogEngine.addSubscribers(new SashaSubscriber());

        blogEngine.addSubscribers(new NikitaSubscriber());

        blogEngine.publishPost(post);
    }
}
