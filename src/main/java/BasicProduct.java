
public class BasicProduct extends Product {
    public BasicProduct(String name, int availabileQuantity, int advance, int baseDayPrice ) {
        super(name, availabileQuantity, advance, baseDayPrice);
    }


    @Override
    public int calculateDayPrice() {
        return this.baseDayPrice;
    }

    @Override
    public boolean rent(int quantity) {
        return false;
    }
}
