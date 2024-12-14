import java.util.*;

public class Assignment17
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the student: ");
		int grade=sc.nextInt();
		if(grade>90){
		    System.out.println("Grade: A");
		}
		else if(grade>75 && grade<=90){
		    System.out.println("Grade: B");
		}
		else if(grade>60 && grade<=75){
		    System.out.println("Grade: C");
		}
		else if(grade>40 && grade<=60){
		    System.out.println("Grade: C");
		}else{
		    System.out.println("Grade: D");
		}
	}
}
