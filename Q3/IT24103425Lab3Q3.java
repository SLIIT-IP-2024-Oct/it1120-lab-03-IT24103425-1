import java.util.Scanner;

public class IT24103425Lab3Q3 {

    public static void main(String[] args) {
        // um creating  an array 
        int[] amouts = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();
        
        
        for (int rupee : amouts) {
            
            int count = amount / rupee;
            
            amount = amount % rupee;
            
            
            System.out.println(rupee + " Notes - " + count);
        }
        
        
}
}
