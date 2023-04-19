public class SavingAccount extends Account{
    private double interestRate = 8.25;
    private double balance;

    public SavingAccount(int accountNumber, int pin, double balance){
        super(accountNumber, pin);
        this.balance = balance;

    }

    public SavingAccount() {
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("You have deposited " + amount + " your checking balance is " + balance);
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("you have withdrawn " + amount + " your balance is " + balance);
    }


}
