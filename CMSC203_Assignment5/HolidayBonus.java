public class HolidayBonus {

    private static final double highestBonus = 5000.0;
    private static final double lowestBonus = 1000.0;
    private static final double otherBonus = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double highestSales = TwoDimRaggedArrayUtility.getHighestInRow(data, i);
            double lowestSales = TwoDimRaggedArrayUtility.getLowestInRow(data, i);
            double totalSales = TwoDimRaggedArrayUtility.getRowTotal(data, i);
            
            if (highestSales == lowestSales) {
                bonuses[i] = highestBonus;
            } else {
                bonuses[i] = (totalSales - highestSales - lowestSales) * otherBonus + highestBonus + lowestBonus;
            }
        }
        
        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double totalBonus = 0.0;
        
        for (double[] storeSales : data) {
            double highestSales = TwoDimRaggedArrayUtility.getHighestInArray(data);
            double lowestSales = TwoDimRaggedArrayUtility.getLowestInArray(data);
            double totalSales = TwoDimRaggedArrayUtility.getTotal(data);
            
            if (highestSales == lowestSales) {
                totalBonus += highestBonus;
            } else {
                totalBonus += (totalSales - highestSales - lowestSales) * otherBonus + highestBonus + lowestBonus;
            }
        }
        
        return totalBonus;
    }
}
