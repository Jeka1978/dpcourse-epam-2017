package strategy.games;

import lombok.Setter;

public class King {
    private int hp = 100;

    @Setter
    private FightBehaviour fightBehaviour = new Sword();
    public void fight() {
        fightBehaviour.fight();
        if (hp < 50) {
            fightBehaviour = new Knife();
        }
        hp--;
    }
}
