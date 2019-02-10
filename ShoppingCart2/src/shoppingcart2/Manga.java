package shoppingCart2;

public class Manga extends Book{
  private int age;
  private String name="Manga";
  private String mangaName;
  private int id;

  public Manga(int id,double regularPrice,int bulkQuantity,String mangaName,String publisher, int yearPublished, int age) {
    super(regularPrice,bulkQuantity,publisher, yearPublished);
    this.age = age;
    this.id=id;
    this.mangaName=mangaName;
  }
  /*public double computeSalePrice() {
    return 0;
  }*/
  /*public String getMangaName(){
    return mangaName;
  }*/
  public int getId(){
    return this.id;
  }    
  /*public String getName(){
    return this.name;
  }*/   
  public String toString(){
    return name+" ... "+mangaName+" ... "+getBulkQuantity()+" ... "+getRegularPrice()+"$";
  }
  public String details(){
    return ("Details :\n\ttype : "+name+"\n\tname : "+mangaName+"\n\tage : +"+age+"\n\tpublisher : "+getPublisher()+"\n\tyear published : "+getYearPublished ()+"\n\tregular price : "+getRegularPrice()+"$");
  }
  public String checkOut(){
    return this.name+" ("+this.mangaName+")";
  }
}
