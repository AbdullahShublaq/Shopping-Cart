package shoppingCart2;

public class MP3Player extends Electronics {
  private String color;
  private String name="mp3";
  private int id;

  public MP3Player(int id,double regularPrice,int bulkQuantity,String manufacturer, String color) {
    super(regularPrice,bulkQuantity,manufacturer);
    this.color = color;
    this.id=id;
  }

  /*public double computeSalePrice() {
    return 0;
  }*/
  public int getId(){
    return this.id;
  }  
  /*public String getName(){
    return this.name;
  }*/  
  /*public String getColor() {
    return color;
  }*/

  /*public void setColor(String color) {
    this.color = color;
  }*/
  public String toString(){
    return name+" ... "+color+" ... "+getBulkQuantity()+" ... "+getRegularPrice()+"$";
  }
  public String details(){
    return ("Details :\n\ttype : "+name+"\n\tcolor : "+color+"\n\tmanufacturer : "+getManufacturer()+"\n\tregular price : "+getRegularPrice()+"$");
  }
  public String checkOut(){
    return this.name+" ("+getManufacturer()+"_"+this.color+")";
  }
}
