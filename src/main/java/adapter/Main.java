package adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LegacyInventoryRepository repository = new LegacyInventoryRepository();
        List<Costable> stuff = repository.getStuff();
        Calculator calculator = new Calculator();
        int calc = calculator.calcTolal(stuff);
        System.out.println("calcTolal = " + calc);
    }
}
