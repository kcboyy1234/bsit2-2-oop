public class BankAccount {
    public static String bankName = "Liceo Bank";
    public static double interestRate = 0.03;
    public static int totalAccounts = 0;
    private static int accountCounter = 1;

    public static String generateAccountNumber() {
        return "ACC" + String.format("%03d", accountCounter++);
    }

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accHolderName, double initialBalance) {
        accountHolderName = accHolderName;
        balance = initialBalance;
        accountNumber = generateAccountNumber();
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName + " with initial balance: $" + balance);
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(accountHolderName + " attempted to withdraw $" + amount + " but has insufficient balance.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}