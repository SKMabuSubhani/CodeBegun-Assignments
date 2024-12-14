import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        try{
            System.out.print("Enter two numbers:");
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int div=n/m;
            System.out.print("Result: "+div);
        }
       catch (InputMismatchException a) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
       
   
    }
}
