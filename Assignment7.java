import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        
        try{
            int div=n/m;
            System.out.print("m divides on n");
        }
        catch(ArithmeticException e){
            System.out.print("Error: Division by zero is not allowed.");
        }
       
   
    }
}
