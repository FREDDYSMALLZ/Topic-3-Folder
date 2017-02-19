import java.util.Scanner;
public class Chapter6Exercise {

	public static void main(String[] args) {
		//Palindrome integer
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter an integer:");//Prompts the user to enter an integer
		  int number = input.nextInt();
		 
		  if (isPalindrome(number)) {
		   System.out.print(number + " is a palindrome");
		   
		  } else {
		   System.out.print(number + " is not a palindrome");
		  }
		 
		 }
		 
		 public static int reverse(int number) {// returns the reversal of an integer
		  int reverse = 0;
		  
		 
		  return reverse;
		 }
		 
		 public static boolean isPalindrome(int number) {//Returns if true the number is palindrome
		 
		  return (number == reverse(number));
		 
		 }
		 
	}


