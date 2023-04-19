import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    public void login() {

        data.put(1,1234);
        data.put(2, 1345);
        System.out.println("Welcome to our bank");
        System.out.println("Please enter your account number");
        int accNo = input.nextInt();
        System.out.println("Please enter your pin");
        int pin = input.nextInt();

        if(data.get(accNo) == pin){
            getAccountType();

        }else{
            System.out.println("Wrong account number of pin");
            System.out.println("Try again");
            login();
        }

    }

    public void getAccountType(){
        System.out.println("Which account do you want to access");
        System.out.println("Press i for checking Account");
        System.out.println("Press 2 for saving Account ");
        System.out.println("Press 3 to exit");
        int option = input.nextInt();

        switch (option){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid option");
                System.out.println("Try again");
                getAccountType();
        }

    }

    public void getChecking(){
        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("Welcome to checking account");
        System.out.println("What do you want to do?");
        System.out.println("1: check balance");
        System.out.println("2: deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Your checking balance is " + checkingAccount.getBalance());
                getChecking();
                break;

            case 2:
                System.out.println("Enter the amount you want to deposit");
                double amount = input.nextDouble();
                checkingAccount.deposit(amount);
                getAccountType();
                break;
            case 3:
                System.out.println("Enter the amount you want to withdraw");
                double amountt = input.nextDouble();
                checkingAccount.withdraw(amountt);
                getAccountType();
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("Invalid choice");
                System.out.println("Try again");
                getChecking();


        }
    }
    public void getSaving(){
        SavingAccount savingAccount = new SavingAccount();
        System.out.println("Welcome to saving account");
        System.out.println("What do you want to do?");
        System.out.println("1: check balance");
        System.out.println("2: deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Your checking balance is " + savingAccount.getBalance());
                break;

            case 2:
                System.out.println("Enter the amount you want to deposit");
                double amount = input.nextDouble();
                savingAccount.deposit(amount);
                getAccountType();
                break;
            case 3:
                System.out.println("Enter the amount you want to withdraw");
                double amountt = input.nextDouble();
                savingAccount.withdraw(amountt);
                getAccountType();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                System.out.println("Try again");
                getSaving();


        }
    }
}
