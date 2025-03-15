class BankAccount{
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: " + this.getClass().getSimpleName());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: Rs." + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int depositTerm; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.00, 2.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 3000.00, 1000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.00, 12);

        savings.displayAccountDetails();
        System.out.println();
        checking.displayAccountDetails();
        System.out.println();
        fixedDeposit.displayAccountDetails();
    }
}
