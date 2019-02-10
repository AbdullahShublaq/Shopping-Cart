package shoppingCart2;

public class TV extends Electronics {
  private int size;
  private String name="TV";
  private int id;
  
  public TV(int id,double regularPrice,int bulkQuantity ,String manufacturer, int size) {
    super(regularPrice,bulkQuantity,manufacturer);
    this.size = size;
    this.id=id;
  }

  /*public double computeSalePrice(){
    return 0;
  }*/
  public int getId(){
    return this.id;
  }  
  /*public String getName(){
    return this.name;
  }*/  
  public String toString(){
    return name+" ... "+size+" Inch"+" ... "+getBulkQuantity()+" ... "+getRegularPrice()+"$";
  }
  public String details(){
    return ("Details :\n\ttype : "+name+"\n\tsize : "+size+" Inch\n\tmanufacturer : "+getManufacturer()+"\n\tregular price : "+getRegularPrice()+"$");
  }
  public String checkOut(){
    return this.name+" ("+getManufacturer()+"_"+this.size+" Inch)";
  }  
}
