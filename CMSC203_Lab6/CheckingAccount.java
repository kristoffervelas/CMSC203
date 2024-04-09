public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15;

    //creates a new checkinaccount object and using the bankaccount constructor to also initialize a bankaccount object using the checkingaccount parameters
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    //overrides the bankaccount withdraw method and deducts the amount while adding the fee
    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount + FEE;
        return super.withdraw(totalAmount);
    }
}
