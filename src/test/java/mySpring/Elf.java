package mySpring;

import lombok.Data;

import javax.annotation.PostConstruct;
import java.util.Random;

@Data
public class Elf {
    @PostConstruct
    public void init() {
        System.out.println(power);
    }

    @InjectRandomInt(min = 30,max = 50)
    private int power;
    @InjectRandomInt(min = 200,max = 250)
    private int dexterity;
    @InjectRandomInt(min = 3,max = 15)
    private int hp;

}
