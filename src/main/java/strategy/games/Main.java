package strategy.games;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        for (int i = 0; i < 60; i++) {
            king.fight();
        }
    }
}
