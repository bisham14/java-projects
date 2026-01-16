import java.util.Scanner;

public class weight_conv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        double converted_weight;
        int choice;


        System.out.println("weight converted machine");
        System.out.println("1: convert ibs into kg");
        System.out.println("2: convert kg into ibs");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice==1){
            System.out.print("Enter your weight in ibs: ");
            weight = sc.nextDouble();
            converted_weight = weight*0.453;
            System.out.printf("The new weight in kg: %.3f",converted_weight);
        }
        else if (choice == 2) {
            System.out.print("Enter your weight in kg: ");
            weight = sc.nextDouble();
            converted_weight = weight*2.2;
            System.out.printf("The new weight in ibs: %.3f",converted_weight);
        }
        else {
            System.out.println("This is not valid choice");
        }


        sc.close();
    }
}
