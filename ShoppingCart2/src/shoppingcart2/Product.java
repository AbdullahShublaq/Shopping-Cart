package shoppingCart2;

public abstract class Product implements ProductInterFace {
  private double regularPrice;
  private int bulkQuantity;
  /**/ private int quantity;/*sale quantity*/
  
  public Product(double regularPrice,int bulkQuantity) {
    this.regularPrice = regularPrice;
    this.bulkQuantity=bulkQuantity;
  }

  /*public double computeSalePrice() {
    return 0;
  }*/

  public double getRegularPrice() {
    return this.regularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }
  public abstract String toString();
  public abstract String details();
  public abstract String checkOut();
  //public abstract String getName();
  public abstract int getId();
  
  public int getBulkQuantity(){
    return bulkQuantity;
  }
  public void increaseBulkQuantity(int quantity){
    this.bulkQuantity+=quantity;
  }
  public void decreaseBulkQuantity(int quantity){
    this.bulkQuantity-=quantity;
  }
  
  /*..........................................*/  
    
  public int getQuantity(){
    return quantity;
  }
  public void setQuantity(int quantity){
    this.quantity+=quantity;
  }
  public void decreaseQuantity(int quantity){
    this.quantity-=quantity;
  }
  public double getPrice(int quantity){
    return quantity * getRegularPrice();
  }
  public double getPrice(){
    return this.quantity * getRegularPrice();
  }
  public String ShowCart(){
    return checkOut()+" .. "+this.quantity+" .. "+getPrice()+"$";
  } 
}
