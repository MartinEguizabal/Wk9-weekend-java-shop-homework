import java.util.HashMap;

public class Customer {

  private boolean loyality_card;
  private HashMap<Item, Integer> basket;

  public Customer(boolean loyality_card){
  // public Customer(HashMap<Item, Integer> basket, boolean loyality_card){
    this.loyality_card = loyality_card;
    this.basket = new HashMap<Item, Integer>(); 
  }

  public boolean getLoyalty(){
    return this.loyality_card;
  }

  public void setLoyalty(boolean loyalty){
    this.loyality_card = loyalty;
  }

  public HashMap<Item, Integer> getBasket(){
    // System.out.println(this.basket);
    return this.basket;
  }

  public boolean checkIfBasketEmpty(){
    return this.basket.isEmpty();
  }

  // public int countBasket(){

  // }

  // public void addToBasket(Item key, Integer amount){
  //   this.basket.put(key, amount);
  // }

}