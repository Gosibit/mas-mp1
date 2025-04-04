
abstract public class Product {
 protected String name;
 protected int availabileQuantity;
 protected int advance;
 protected int baseDayPrice;

 Product(String name, int availabileQuantity, int advance, int baseDayPrice) {
     this.name = name;
     this.availabileQuantity = availabileQuantity;
     this.advance = advance;
     this.baseDayPrice = baseDayPrice;
 }

 public abstract int calculateDayPrice();
 public abstract boolean rent(int quantity);
}
