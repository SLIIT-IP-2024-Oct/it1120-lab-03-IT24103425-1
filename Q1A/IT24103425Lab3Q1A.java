import java.util.Scanner;

class IT24103425Lab3Q1A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();

        System.out.println("Enter the number of kilograme you want:  ");
        double kilograme = sc.nextDouble();

        double totalAmount = price * kilograme;

        System.out.println("The total amount you have to pay is :" + totalAmount);

    }

}