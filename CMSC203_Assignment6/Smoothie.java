public class Smoothie extends Beverage {
    private int numFruits;
    private boolean proteinPowder;
    private final double FRUIT_COST = 0.5;
    private final double PROTEIN_COST = 1.5;

    public Smoothie(String bevName, Size size, int numFruits, boolean proteinPowder) {
        super(bevName, Type.SMOOTHIE, size);
        this.numFruits = numFruits;
        this.proteinPowder = proteinPowder;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        price += numFruits * FRUIT_COST;
        if (proteinPowder) price += PROTEIN_COST;
        return price;
    }

    @Override
    public String toString() {
        return "Smoothie [bevName=" + getBevName() + ", size=" + getSize() + ", numFruits=" + numFruits + ", proteinPowder=" + proteinPowder + "]";
    }
}
