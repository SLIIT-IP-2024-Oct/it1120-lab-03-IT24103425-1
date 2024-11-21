import java.util.Scanner;

public class IT24103425Lab3Q1B {

    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();

        System.out.println("Enter the number of kilograme you want:  ");
        double kilograme = sc.nextDouble();

        double totalAmount = price * kilograme;
        double discount = totalAmount * 0.10;
        double amountAfterDiscount =   totalAmount - discount;

        System.out.println("The total anount with 10% discount is: " + amountAfterDiscount);


        
    }

}