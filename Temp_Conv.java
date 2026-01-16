import java.util.Scanner;

public class Temp_Conv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temp: ");
        temp = sc.nextDouble();

        System.out.println("Convert to celsius(C) or fahrenheit(F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp-32)/1.8 : (temp*1.8)+32;

        System.out.printf("%.2f %s",newTemp ,unit);

    sc.close();
    }
}
