import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file=new File("simple.txt");
        Scanner fileScanner=null;
        
        try{
            fileScanner=new Scanner(file);
            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        }
       catch (FileNotFoundException a) {
            System.out.println("Error: File not found.");
        } finally{
             if (fileScanner != null) {
                fileScanner.close();
            }
            System.out.println("File operation completed.");
        }
        }
   
    
}
