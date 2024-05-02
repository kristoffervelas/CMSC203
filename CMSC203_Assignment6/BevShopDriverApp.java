import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop(); // Creating an instance of BevShop

        System.out.println("The current order in process can have at most " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());
        System.out.println("Start please a new order:");

        while (true) {
            bevShop.startNewOrder(10, Day.MONDAY, "", 0); // Start a new order, initialize name and age later
            System.out.println("Your Total Order for now is " + bevShop.totalOrderPrice(0));

            System.out.println("Would you please enter your name:");
            String name = scanner.nextLine();

            System.out.println("Would you please enter your age:");
            int age = Integer.parseInt(scanner.nextLine());

            if (age >= bevShop.getMinAgeForAlcohol()) {
                System.out.println("Your age is above " + (bevShop.getMinAgeForAlcohol() - 1) + " and you are eligible to order alcohol");

                int alcoholCount = 0;
                double totalPrice = 0.0;

                while (alcoholCount < bevShop.getMaxOrderForAlcohol()) {
                    System.out.println("Would you please add an alcohol drink:");
                    String alcoholDrink = scanner.nextLine();
                    bevShop.processAlcoholOrder(alcoholDrink, Size.MEDIUM);
                    alcoholCount++;
                    totalPrice = bevShop.totalOrderPrice(0);

                    System.out.println("The current order of drinks is " + bevShop.getNumOfAlcoholDrink());
                    System.out.println("The Total price on the Order is " + totalPrice);

                    if (!bevShop.isEligibleForMore()) {
                        System.out.println("You have reached the maximum number of alcohol drinks for this order");
                        break;
                    }
                }
            }

            System.out.println("Would you please add a COFFEE to your order:");
            bevShop.processCoffeeOrder("Coffee", Size.MEDIUM, false, false);
            double totalPrice = bevShop.totalOrderPrice(0);
            System.out.println("Total items on your order is " + bevShop.totalNumOfMonthlyOrders() + "\nThe Total Price on the Order: " + totalPrice);

            System.out.println("Would you please add a SMOOTHIE to your order:");
            bevShop.processSmoothieOrder("Smoothie", Size.MEDIUM, 5, true);
            totalPrice = bevShop.totalOrderPrice(0);
            System.out.println("Total items on your order is " + bevShop.totalNumOfMonthlyOrders() + "\nThe Total Price on the Order: " + totalPrice);

            System.out.println("#------------------------------------#");
            System.out.println("Would you like to start a new order? (yes/no):");
            String continueOrder = scanner.nextLine();
            if (!continueOrder.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
