package mySpring;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
