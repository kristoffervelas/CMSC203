public enum Size {
    SMALL(8),
    MEDIUM(12),
    LARGE(16);

    private final int ounces;

    Size(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }
}
