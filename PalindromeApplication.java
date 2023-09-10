import java.util.Scanner;
import java.util.Stack;
/** 
 * @author RVera
 * This program uses a stack to determine if a string is a Palindrome
 * or not, comparing the original and reverse string. 
 */
public class PalindromeApplication {

	public static void main(String[] args) {
		
		/**
		 * Declares two string variables in str and rev
		 * takes input from the user using the scanner class and 
		 * uses a stack to organize the string
		 */
		
		String str, rev = "";
		Scanner  p = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		/** 
		 * The inputed string is stored in str is then changed to lowercase 
		 */
		
		System.out.println("Is it a palindrome?" + "\n" + "Enter a string: ");
		str = p.nextLine();
		str = str.toLowerCase(); 
		
		/**
		 * The string is then iterated and pushes characters into the stack
		 */
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}//end for
		
		/**
		 * Until the stack is empty, with each iteration it
		 * continuously pops each character stored into rev 
		 * as the reverse string
		 */
		
		while (!stack.isEmpty()) {
			rev = rev + stack.pop();
		}//end while
		
		/**
		 * Variables str and rev are compared and 
		 * outputs the string is a palindrome
		 * otherwise is not a palindrome
		 */
		
		if (str.equals(rev)) {
			System.out.println(str + " is a palindrome.");
		}//end if
			else {
			System.out.println(str + " is not a palindrome.");
		}//end else
		
	
		p.close();
		//close scanner
		
	
	}//end main

}//end class

/**
 * Example output
 * 
 * Is it a palindrome?
 *Enter a string: 
 *Hannah
 *hannah is a palindrome.
 */
