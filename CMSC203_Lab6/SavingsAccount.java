public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.025; // annual interest rate
    private static int savingsNumber = 0; //counter for each savings accounts
    private int mySavingsNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        mySavingsNumber = savingsNumber++;
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber() + "-" + mySavingsNumber;
    }

    //calculates and deposits the monthly interest into the account
    public void postInterest() {
        double interest = getBalance() * INTEREST_RATE / 12;
        deposit(interest);
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
        super(oldAccount, initialBalance);
        mySavingsNumber = oldAccount.mySavingsNumber + 1;
    }
}
