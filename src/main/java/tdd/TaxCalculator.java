package tdd;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class TaxCalculator {

    @Autowired
    @Setter
    private NDSResolver ndsResolver;

    public double withNDS(double price) {
        double nds = ndsResolver.getNds();
        return nds * price + price;
    }
}
