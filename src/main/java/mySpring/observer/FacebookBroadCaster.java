package mySpring.observer;

public class FacebookBroadCaster implements BroadCaster {
    @Override
    public void broadCastPost(Post post) {
        System.out.println("publishing to facebook "+post);
    }
}
