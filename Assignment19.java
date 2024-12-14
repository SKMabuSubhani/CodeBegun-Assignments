import java.util.*;

public class Assignment19
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word=sc.nextLine();
		if (isPalindrome(word)) {
            System.out.println('"' + word + " is a palindrome.");
        } else {
            System.out.println('"' + word + " is not a palindrome.");
        }
	}
	public static boolean isPalindrome(String word){
	    String rev=new StringBuilder(word).reverse().toString();
	    return word.equals(rev);
	}
}
