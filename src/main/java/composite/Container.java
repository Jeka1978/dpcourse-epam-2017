package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Container implements Item {

    private List<Item> items = new ArrayList<>();

    public abstract int getMyPrice();

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum() + getMyPrice();
    }

    public void add(Item item) {
        items.add(item);
    }
}
