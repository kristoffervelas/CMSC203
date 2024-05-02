public abstract class Beverage {
    private String bevName;
    private Type type;
    private Size size;
    private final double BASE_PRICE = 2.0;
    private final double SIZE_PRICE = 0.5;

    public Beverage(String bevName, Type type, Size size) {
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }

    public abstract double calcPrice();

    public String getBevName() {
        return bevName;
    }

    public void setBevName(String bevName) {
        this.bevName = bevName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getSizePrice() {
        return SIZE_PRICE;
    }

    public double addSizePrice() {
        double price = BASE_PRICE;
        if (size == Size.MEDIUM || size == Size.LARGE) {
            price += SIZE_PRICE;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Beverage [bevName=" + bevName + ", type=" + type + ", size=" + size + "]";
    }

    @Override
    public boolean equals(Object anotherBev) {
        if (this == anotherBev)
            return true;
        if (!(anotherBev instanceof Beverage))
            return false;
        Beverage beverage = (Beverage) anotherBev;
        return getBevName().equals(beverage.getBevName()) && getType() == beverage.getType() && getSize() == beverage.getSize();
    }
}
