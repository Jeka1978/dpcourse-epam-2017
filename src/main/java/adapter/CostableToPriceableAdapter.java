package adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CostableToPriceableAdapter implements Priceable {
    private Costable costable;
    @Override
    public int getPrice() {
        return costable.getCost();
    }
}
