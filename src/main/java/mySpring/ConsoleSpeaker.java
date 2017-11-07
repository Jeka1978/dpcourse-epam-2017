package mySpring;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Benchmark
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
