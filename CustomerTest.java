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
  Item item7;
  Item item8;
  Customer customer1;
  Customer customer2;
  Customer customer3;

  @Before
  public void before(){
    item1 = new Item("toothpaste", 1.25);
    item2 = new Item("watermelon", 2.00);
    item3 = new Item("cloth", 0.99);
    item4 = new Item("rice", 2.99);
    item5 = new Item("watermelon", 2.00);
    item6 = new Item("pizza", 2.00);
    item7 = new Item("pizza", 2.00);
    item8 = new Item("shirt", 15.00);
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
  public void canCheckIfBasketEmpty(){
    assertEquals(true, customer3.checkIfBasketEmpty());
  }

  // @Test
  // public void canAddToBasket(){
  //   customer3.addToBasket(item2, 1);
  //   assertEquals
  // }

}