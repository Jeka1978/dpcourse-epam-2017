package strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Delegate;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RadioAlarm implements Radio, Alarm {
    @Delegate
    private Alarm alarm = new AlarmImpl();
    @Delegate
    private Radio radio = new RadioImpl();
}
