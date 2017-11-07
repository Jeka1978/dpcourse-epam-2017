package adapter;

import java.util.Arrays;
import java.util.List;

@Deprecated
public class LegacyInventoryRepository {
    public List<Costable> getStuff() {
        return Arrays.asList(new Table(), new Table(), new Chair());
    }
}
