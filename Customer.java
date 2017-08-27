import java.util.HashMap;

public class Customer {

  boolean loyality_card;
  HashMap<Item, Integer> basket;

  public Customer(boolean loyality_card){
  // public Customer(HashMap<Item, Integer> basket, boolean loyality_card){
    this.loyality_card = loyality_card;
    this.basket = new HashMap<Item, Integer>(); 
  }
}