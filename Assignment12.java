import java.util.*;

public class Assignment12{
    
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("Enter a sentence:");
	  String sentence=sc.nextLine();
	  
	  HashSet<String> uniquewords=new HashSet<>();
	  
	  String[] words=sentence.split("\\s+|\\.|\\,");
	  
	  for(String word:words){
	      if(!word.isEmpty()){
	          uniquewords.add(word);
	      }
	  }
	  
	  System.out.println("Unique words: " + uniquewords);
	
	}
}
