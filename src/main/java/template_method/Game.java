package template_method;

import java.util.List;


//player
public abstract class Game {
    private Player player1 = new Player();
    private Player player2 = new Player();

    //player
    public final void play() {
        prepareBoard();
        while (!endOfGame()) {
            player1.move();
            player2.move();
        }
        List<Score> score = calcScore();
        updateScore(score);

    }

    protected abstract boolean endOfGame();

    protected abstract void prepareBoard();

    private void updateScore(List<Score> score) {
        score.forEach(System.out::println);
    }

    protected abstract List<Score> calcScore();
}
