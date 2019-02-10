package shoppingCart2;

public abstract class Electronics extends Product implements ElectronicsInterFace {
  private String manufacturer;

  public Electronics(double regularPrice,int bulkQuantity,String manufacturer) {
    super(regularPrice,bulkQuantity);
    this.manufacturer = manufacturer;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
}
