package composite;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeTest {

    @Test
    public void test() throws Exception {
        Book book1 = new Book(10);
        Book book2 = new Book(20);
        Shelf shelf = new Shelf(30);
        Cupboard cupboard = new Cupboard(40);
        shelf.add(book1);
        shelf.add(book2);
        cupboard.add(shelf);

        Assert.assertEquals(60,shelf.getPrice());
        Assert.assertEquals(100,cupboard.getPrice());

    }
}


