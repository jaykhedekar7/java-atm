import java.util.Scanner;

public class main {

    public static void main(String args[]){

        int choice;
//        Initial amount in the account is 10000
        double bankBalance = 10000;
//        Interest rate is assumed to be 7%
        double interest;
//        Number of years for fixed deposit
        double years;
//        This will be the amount the user want to withdraw
        int transaction;
//        This will be the amount the user want to deposit.
        int deposit;
//        Amount for fixed deposit
        int amount;


        Scanner scan = new Scanner(System.in);
        System.out.println("Select your option:\n");
        System.out.println("1. Withdraw\n");
        System.out.println("2. Check Balance\n");
        System.out.println("3. Deposit\n");
        System.out.println("4. Make a Fixed Deposit\n");
        System.out.println("5. Exit\n");

        choice = scan.nextInt();

        while(choice != 5){

            System.out.println("Select your option:\n");
            System.out.println("1. Withdraw\n");
            System.out.println("2. Check Balance\n");
            System.out.println("3. Deposit\n");
            System.out.println("4. Make a Fixed Deposit\n");
            System.out.println("5. Exit\n");

        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount you want to withdraw:\n");
                transaction = scan.nextInt();
                if (transaction > bankBalance) {
                    System.out.println("\nSorry you don't have enough cash!");
                } else {
                    bankBalance = bankBalance - transaction;
                    System.out.println("\nTransaction Successful. You remaining balance is: " + bankBalance);

                }
                break;

            case 2:
                System.out.println("\nYour balance is: " + bankBalance);
                break;

            case 3:
                System.out.println("\nEnter amount you want to deposit: ");
                deposit = scan.nextInt();

                if (deposit > 0) {
                    System.out.println("Deposited!\n");
                    bankBalance = bankBalance + deposit;
                    System.out.println("You bank balance is: " + bankBalance);
                } 
                else {
                    System.out.println("Enter valid amount\n");
                }

                break;

            case 4:
                System.out.println("\nEnter the amount for fixed deposit: ");
                amount = scan.nextInt();
                System.out.println("Enter number for years for fixed deposit: ");
                years = scan.nextInt();
                interest = amount * years * 0.07;
                bankBalance = bankBalance + interest;
                System.out.println("\nYour bank balance after fixed deposit would be: " + bankBalance);
                break;

            case 5:
                System.out.println("\nExited);
                break;

            default:
                System.out.println("\nEnter valid input.");
                break;


        }
        }
    }
}
