package mySpring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InjectRandomIntTest {

    @Test
    public void testThatInjectRandomIntSupportedByObjectFactory() throws Exception {
        ObjectFactory factory = ObjectFactory.getInstance();
        Elf elf = factory.createObject(Elf.class);
        System.out.println("elf = " + elf);
        Assert.assertTrue(elf.getPower()>0);
        Assert.assertTrue(elf.getDexterity()>0);
        Assert.assertTrue(elf.getHp()>0);
    }
}