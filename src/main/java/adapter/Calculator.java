package adapter;

import java.util.List;

public class Calculator {
    public int calcTolal(List<Priceable> priceables) {
        return priceables.stream().mapToInt(Priceable::getPrice).sum();
    }
}
