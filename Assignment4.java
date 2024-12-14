import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();
        int salary;

        if (experience < 0) {
            System.out.println("Invalid input! Experience cannot be negative.");
            return; 
        } else if (experience > 10) {
            salary = 100000;
        } else if (experience >= 5) {
            salary = 75000;
        } else {
            salary = 50000;
        }

      
        System.out.println("Salary: " + salary);
    }
}
