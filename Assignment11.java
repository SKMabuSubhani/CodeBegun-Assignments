import java.util.*;

public class Assignment11
{
	public static void main(String[] args) {
	  HashSet<String> set=new HashSet<>();
	  
	  set.add("apple");
	  set.add("banana");
	  set.add("orange");
	  
	  System.out.println("Initial Set: " + set);
	  
	  String removeItem="banana";
	  
	  if(set.remove(removeItem)){
	      System.out.println("Removed '" + removeItem + "' from the set. \n");
	  }
	  else{
	        System.out.println("'" + removeItem + "' not found in the set.\n");
	  }
	  
	  System.out.println("Set after removal: " + set+"\n");
	  
	  String checkItem="orange";
	  
	  if(set.contains(checkItem)){
	        System.out.println("'" + checkItem + "' exists in the set: true");
        } else {
            System.out.println("'" + checkItem + "' exists in the set: false");
	  }
	
	}
}
