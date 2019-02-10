package shoppingCart2;

public abstract class Book extends Product implements BookInterFace {
  private String publisher;
  private int yearPublished;

  public Book(double regularPrice,int bulkQuantity ,String publisher, int yearPublished) {
    super(regularPrice,bulkQuantity);
    this.publisher = publisher;
    this.yearPublished = yearPublished;
  }

  /*public double computeSalePrice() {
    return 0;
  }*/

  public String getPublisher () {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.yearPublished = yearPublished;
  }

  public int getYearPublished() {
    return yearPublished;
  }

  public void setYearPublished(int yearPublished) {
    this.yearPublished = yearPublished;
  }
}
