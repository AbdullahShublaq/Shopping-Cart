package shoppingCart2;

public class Cartoon extends Book {
  private String characterName;
  private String name="Cartoon";
  private int id;

  public Cartoon(int id,double regularPrice,int bulkQuantity,String publisher, int yearPublished, String characterName) {
    super(regularPrice,bulkQuantity,publisher, yearPublished);
    this.characterName = characterName;
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
  public String toString(){
    return name+" ... "+characterName+" ... "+getBulkQuantity()+" ... "+getRegularPrice()+"$";
  }
  public String details(){
   return ("Details :\n\ttype : "+name+"\n\tcharacter name : "+characterName+"\n\tpublisher : "+getPublisher()+"\n\tyear published : "+getYearPublished()+"\n\tregular price : "+getRegularPrice()+" $"); 
  }
  public String checkOut(){
    return this.name+" ("+this.characterName+")"; 
  }
}
