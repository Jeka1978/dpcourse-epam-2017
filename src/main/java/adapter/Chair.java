package adapter;

@Deprecated
public class Chair implements Costable {
    @Override
    public int getCost() {
        return 10;
    }
}
