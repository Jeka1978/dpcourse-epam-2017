package mySpring.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PostEvent {
    private Post post;
    private LocalDateTime dateTime;
}
