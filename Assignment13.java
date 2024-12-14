import java.util.*;

public class Assignment13{
    
	public static void main(String[] args) {
	 TreeSet<Integer> EmpId=new TreeSet<>();

	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("Enter employee IDs :");
	  String input=sc.nextLine();

	  
	  String[] ids=input.split(",");
	  
	  for(String id:ids){
	     try{
	         EmpId.add(Integer.parseInt(id.trim()));
	     }catch(NumberFormatException e){
	        System.out.println("Invalid ID: " + id + " (skipped)");
	     }
	  }
	  
	  System.out.println("Employee IDs (sorted): " + EmpId);
	
	}
}
