package immutable;

import lombok.ToString;

@ToString
public class Client {
    private final String name;
    private final int bonus;
    private final int debt;

   /* public void addBonus(int delta) {
        bonus += delta;
    }*/
}
