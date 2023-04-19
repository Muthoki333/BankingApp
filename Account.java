public abstract class Account {

    public Account() {
    }

    Account(int accountNumber, int pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
        balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void checkBalance(){
        System.out.println("Your balance is " + balance);
    }


    private int accountNumber;
    private int pin;
    private double balance;
}
