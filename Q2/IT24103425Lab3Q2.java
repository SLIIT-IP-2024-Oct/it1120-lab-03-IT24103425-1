import java.util.Scanner;


public class IT24103425Lab3Q2 {

    public static void main (String [] args ){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the monthly salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the number of OT hours: ");
        double OT= sc.nextDouble();

        System.out.println("Enter the OT hourly rate: ");
        double OTrate= sc.nextDouble();

        double OtAmount = OT * OTrate;
        double TotalSalary = OtAmount + salary;


        System.out.println("The total salary including OT is : " + TotalSalary);

    }
    
}
