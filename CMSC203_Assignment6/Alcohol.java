public class Alcohol extends Beverage {
    private boolean weekendOffer;
    private final double WEEKEND_COST = 0.6;

    public Alcohol(String bevName, Size size, boolean weekendOffer) {
        super(bevName, Type.ALCOHOL, size);
        this.weekendOffer = weekendOffer;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        if (weekendOffer) price += WEEKEND_COST;
        return price;
    }

    @Override
    public String toString() {
        return "Alcohol [bevName=" + getBevName() + ", size=" + getSize() + ", weekendOffer=" + weekendOffer + "]";
    }
}
