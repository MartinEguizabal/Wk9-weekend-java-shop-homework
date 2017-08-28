import java.util.HashMap;
import java.util.Map.*;

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

  public int countBasket(){
    return this.basket.size();
  }

  public int countItemTypeAmount(Item item){
    return this.basket.get(item);
  }

  // public void addToBasket(Item key, Integer amount){
  //   this.basket.put(key, amount);
  // }

  // public void addToBasket(Item item, Integer amount){
  //   for(Item key : basket.keySet()){
  //     if(key == item){
  //       this.basket.put(item, this.basket.get(item) + amount);
  //     } else {
  //     this.basket.put(item, amount);
  //     }
  //   }
  // }

  // public void addToBasket(Item item, Integer amount){
  //   for(Item key : basket.keySet()){
  //     if(key == item){
  //       this.basket.put(item, this.basket.get(item) += amount);
  //       // System.out.println(key);
  //       }
  //     }
  //     this.basket.put(item, amount);
  //   }

    // public void addToBasket(Item item, Integer amount){
    //   if(this.basket.containsKey(item) == true){
    //     this.basket.put(item, this.basket.get(item) + 1);
    //     }
    //     this.basket.put(item, amount);
    //   }

    public void addToBasket(Item item, Integer amount){
      Integer value = this.basket.get(item);
      if(value == null){
        this.basket.put(item, amount);
      } else {
        value += amount;
      }
    }

    public void removeFromBasket(Item item, Integer amount){
      Integer value = this.basket.get(item);
      if(value > 1){
        this.basket.put(item, this.basket.get(item) - amount);
      } else {
        this.basket.remove(item);
      }
    }

    public void emptyBasket(){
      this.basket.clear();
    }

    public double totalBasket(){
      double total = 0.00;
      for(Entry<Item, Integer> entry : this.basket.entrySet()){
        total += ((entry.getKey().getPrice()) * (entry.getValue()));
      }
      return total;
    }

    public double 2for1(){
      double total = 0.00;
      for(Entry<Item, Integer> entry : this.basket.entrySet()){
        if(entry.getValue() %2 == 0){
          
        }
      }
      return total;
    }



}