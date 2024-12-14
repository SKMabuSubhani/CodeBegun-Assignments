import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Roll Number: " + rollNumber + ")";
    }
}

public class Assignment10 {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\nStudent Database Management:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // Add student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    addStudent(name, rollNumber);
                    break;
                case 2:
                    // Remove student
                    System.out.print("Enter roll number of the student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    removeStudent(rollToRemove);
                    break;
                case 3:
                    // Display students
                    displayStudents();
                    break;
                case 4:
                    // Exit
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

   
    private static void addStudent(String name, int rollNumber) {
        students.add(new Student(name, rollNumber));
        System.out.println("Student added successfully!");
    }

 
    private static void removeStudent(int rollNumber) {
        boolean removed = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                System.out.println("Student removed successfully!");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

   private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("Students in the database:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
