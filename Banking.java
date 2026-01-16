import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Banking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        Boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("******************");
            System.out.println("1. show balance");
            System.out.println("2. Deposit");
            System.out.println("3. withdraw");
            System.out.println("4. Exit");
            System.out.println("******************");
            System.out.print("Enter the option (1-4): ");
            choice =scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += moneyDeposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }
        System.out.println("******************");
        System.out.println("thank u very much");
        System.out.println("******************");

        scanner.close();
    }


     static void showBalance(double balance) {
         System.out.println("******************");
         System.out.printf("$%.3f\n",balance);


    }
     static double moneyDeposit( ){

        double amount;

         System.out.println("Enter the amount you want to deposit: ");
         amount = scanner.nextDouble();

         if(amount<0){
             System.out.println("It can't deposit ");
             return 0;
         }
         else{
             return amount;
         }

     }
    static double withdraw(double balance){

        double amount;

        System.out.println("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();

        if(amount>balance){
            System.out.println("NOT REACHABLE TRY AGAIN");
            return 0;
        } else {
            return amount;
        }
    }

}


