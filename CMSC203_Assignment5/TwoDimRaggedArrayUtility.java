import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public final class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int rows = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            rows++;
        }
        scanner.close();

        double[][] data = new double[rows][];
        scanner = new Scanner(file);
        for (int i = 0; i < rows; i++) {
            String[] rowValues = scanner.nextLine().trim().split("\\s+");
            data[i] = new double[rowValues.length];
            for (int j = 0; j < rowValues.length; j++) {
                data[i][j] = Double.parseDouble(rowValues[j]);
            }
        }
        scanner.close();
        return data;
    }

    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(outputFile);
        for (double[] row : data) {
            for (int j = 0; j < row.length; j++) {
                writer.print(row[j]);
                if (j < row.length - 1) {
                    writer.print(" ");
                }
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] data) {
        double total = 0.0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        double total = getTotal(data);
        int count = 0;
        for (double[] row : data) {
            count += row.length;
        }
        return total / count;
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0.0;
        for (double value : data[row]) {
            total += value;
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0.0;
        for (double[] row : data) {
            if (col < row.length) {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        double highest = data[row][0];
        for (double value : data[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        int highestIndex = 0;
        double highest = data[row][0];
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] > highest) {
                highest = data[row][i];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static double getLowestInRow(double[][] data, int row) {
        double lowest = data[row][0];
        for (double value : data[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        int lowestIndex = 0;
        double lowest = data[row][0];
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] < lowest) {
                lowest = data[row][i];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] > highest) {
                highest = row[col];
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        int highestIndex = -1;
        double highest = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > highest) {
                highest = data[i][col];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] < lowest) {
                lowest = row[col];
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        int lowestIndex = -1;
        double lowest = Double.POSITIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] < lowest) {
                lowest = data[i][col];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInArray(double[][] data) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] data) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }
}
