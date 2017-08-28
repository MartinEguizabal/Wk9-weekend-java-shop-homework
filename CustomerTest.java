import org.junit.*;
import static org.junit.Assert.*;
import java.util.HashMap;

public class CustomerTest {

  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Item item5;
  Item item6;
  Customer customer1;
  Customer customer2;
  Customer customer3;

  @Before
  public void before(){
    item1 = new Item("toothpaste", 1.25);
    item2 = new Item("watermelon", 2.00);
    item3 = new Item("cloth", 0.99);
    item4 = new Item("rice", 2.99);
    item5 = new Item("pizza", 2.00);
    item6 = new Item("shirt", 15.00);
    customer1 = new Customer(true);
    customer2 = new Customer(false);
    customer3 = new Customer(false);
  }

  @Test
  public void canGetLoyalty(){
    assertEquals(true, customer1.getLoyalty());
  }

  @Test
  public void canGetLoyalty__false(){
    assertEquals(false, customer3.getLoyalty());
  }

  @Test
  public void canSetLoyalty(){
    customer2.setLoyalty(true);
    assertEquals(true, customer2.getLoyalty());
  }

  @Test
  public void canCountBasket__startAtZero(){
    assertEquals(0, customer2.countBasket());
  }

  @Test
  public void canAddToBasket(){
    customer3.addToBasket(item2, 1);
    assertEquals(1, customer3.countBasket());
  }

  @Test
  public void canAddToBasket__2orMore(){
    customer3.addToBasket(item2, 1);
    customer3.addToBasket(item2, 1);
    assertEquals(2, customer3.countItemTypeAmount(item2));
  }

  @Test
  public void canRemoveItem(){
    customer2.addToBasket(item1, 1);
    customer2.addToBasket(item1, 1);
    customer2.addToBasket(item1, 1);
    customer2.removeFromBasket(item1, 1);
    assertEquals(2, customer2.countItemTypeAmount(item1));
  }

  @Test
  public void canEmptyBasket(){
    customer2.addToBasket(item1, 1);
    customer2.addToBasket(item2, 1);
    customer2.addToBasket(item3, 1);
    customer2.emptyBasket();
    assertEquals(0, customer2.countBasket());
  }

  @Test
  public void canTotalBasket(){
    customer2.addToBasket(item1, 1);
    customer2.addToBasket(item2, 1);
    customer2.addToBasket(item3, 1);
    assertEquals(4.24, customer2.totalBasket(), 0.01);
  }

  @Test
  public void canTotalBasket__2ofItem(){
    customer2.addToBasket(item1, 2);
    customer2.addToBasket(item2, 1);
    customer2.addToBasket(item3, 1);
    assertEquals(5.49, customer2.totalBasket(), 0.01);
  }

}