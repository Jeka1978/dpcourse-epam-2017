package adapter;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LegacyInventoryRepository repository = new LegacyInventoryRepository();
        List<Costable> stuff = repository.getStuff();
        List<Priceable> list = stuff.stream()
                .map(CostableToPriceableAdapter::new)
                .collect(Collectors.toList());
        Calculator calculator = new Calculator();
        int calc = calculator.calcTolal(list);
        System.out.println("calcTolal = " + calc);
    }
}
