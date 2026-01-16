import java.util.Scanner;

public class Shopingcart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;
        char currency ='$';

        System.out.print("what you want to order: ");
        item = scanner.nextLine();
        System.out.print("what is the price of each?: ");
        price = scanner.nextDouble();
        System.out.print("How much quantity you want: ");
        quantity = scanner.nextInt();

        total = price*quantity;

        System.out.println(" \n you order a "+item+ "/s");
        System.out.println("You have order "+quantity+" quantity");
        System.out.println("Then total price of "+item+" is "+ total+currency);

        scanner.close();
    }
}
