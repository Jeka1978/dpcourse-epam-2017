package template_method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Chess extends Game {
    @Override
    protected boolean endOfGame() {
        Random random = new Random();
        return random.nextInt(4)==1;
    }

    @Override
    protected void prepareBoard() {
        System.out.println("preparing...");
    }

    @Override
    protected List<Score> calcScore() {
        return Arrays.asList(new Score(10),new Score(20));

    }
}
