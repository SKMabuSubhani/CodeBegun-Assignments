import java.util.*;

public class Assignment15{
    
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("Enter a number: ");
	  int n=sc.nextInt();
	  int i=1;
	  System.out.println("Multiplication Table of " + n + ":");
	  while(i<=10){
	      System.out.println(n+" * "+(i)+" = "+(n*i++));
	  }
	   
	
	}
}
