package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TaxCalculatorTest {
    @Test
    public void withNDS() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        NDSResolver mock = Mockito.mock(NDSResolver.class);
        Mockito.when(mock.getNds()).thenReturn(0.20);
        taxCalculator.setNdsResolver(mock);
        double withNDS = taxCalculator.withNDS(100);
        Assert.assertEquals(120,withNDS,0.00001);
    }

}