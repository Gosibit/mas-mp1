
public class PremiumProduct extends Product {

    public static final int PREMIUM_FEE = 10;

    public PremiumProduct(String name, int availabileQuantity, int advance, int baseDayPrice ) {
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