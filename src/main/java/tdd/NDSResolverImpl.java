package tdd;

import lombok.SneakyThrows;

public class NDSResolverImpl implements NDSResolver {
    @SneakyThrows
    public NDSResolverImpl() {
        Thread.sleep(100000);
    }

    @Override
    public double getNds() {
        return 12321;
    }
}
