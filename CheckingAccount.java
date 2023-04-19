public class CheckingAccount extends Account{
    private double overdraft = 1000;
    private final int cost = 10;
    private double balance;

    public CheckingAccount(int accountNumber, int pin, double balance, double overdraft){
        super(accountNumber, pin);
        this.overdraft = overdraft;
        this.balance = balance;

    }

    public CheckingAccount() {
    }

    public int getCost() {
        return cost;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public void withdraw(double amount){
        if ((amount+cost)<balance){
            balance = balance - (amount+cost);
            System.out.println("You have withdrawn " + amount + " your checking balance is " + balance);
        }

    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("You have deposited " + amount + " your checking balance is " + balance);
    }

}
