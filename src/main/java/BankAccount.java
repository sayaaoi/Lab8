/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * A bank account could have the following four different types.
     */
    public enum BankAccountType {
        /**
         * Four different bank types.
         */
        CHECKINGS, SAVINGS, STUDENT, WORKPLACE
    }

    /**
     * Bank account's account number.
     */
    private int accountNumber;

    /**
     * Bank account type.
     */
    private BankAccountType accountType;

    /**
     * The balance in the bank account.
     */
    private double accountBalance;

    /**
     * Bank account's owner's name.
     */
    private String ownerName;

    /**
     * Interest rate of the bank account.
     */
    private double interestRate;

    /**
     * Interest earned from savings.
     */
    private double interestEarned;

    /**
     * public convenience constructor that sets all properties.
     * @param name bank account owner's name
     * @param accountCategory bank account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.setTotalAccounts(Bank.getNumberOfAccount() + 1);

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * Get account number of the account.
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get account balance of the account.
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Set account balance of the account.
     * @param balance the account balance the user put in.
     */
    public void setAccountBalance(final double balance) {
        this.accountBalance = balance;
    }

    /**
     * Get owner's name of bank account.
     * @return owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set bank account's owner name.
     * @param name bank account owner's name.
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /**
     * Get interest earned from savings.
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Get interest rate.
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Set interest rate.
     * @param rate interest rate
     */
    public void setInterestRate(final double rate) {
        this.interestRate = rate;
    }

}
