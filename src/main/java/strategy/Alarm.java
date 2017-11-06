package strategy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Alarm {
    void stop();

    void setTime(LocalDateTime dateTime);
}
