import java.util.Scanner;

public class IT24103425Lab3Q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();
        
        
        if (number >= 10000 && number <= 99999) {     // I have tried if else statement and still getting the same output
            
            System.out.print((number / 10000) + " ");
            System.out.print((number / 1000) % 10 + " ");
            System.out.print((number / 100) % 10 + " ");
            System.out.print((number / 10) % 10 + " ");
            System.out.println(number % 10);
        } else {
            System.out.println("Entered number is worng ");
        }

       
}
}