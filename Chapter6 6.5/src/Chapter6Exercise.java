import java.util.Scanner;
public class Chapter6Exercise {

	public static void main(String[] args) {
		// Sorting numbers in increasing order
		
		Scanner input = new Scanner(System.in);//Create a scanner
		 
		  System.out.print("Enter three numbers:");//Prompts the user to enter three numbers
		  double num1 = input.nextDouble();//Enter the first number
		  double num2 = input.nextDouble();//Enter the second number
		  double num3 = input.nextDouble();//Enter the third number
		  
		  System.out.println("The numbers is increasing order is " + num3 + " "
				    + num2 + " " + num1);
		 
		  displaySortedNumbers(num1, num2, num3);// Display the three sorted numbers
		 
	}
		 
		 public static void displaySortedNumbers(double num1, double num2,
		   double num3) {
		 
		  if (num3 > num2) {// using if statements
			  {
				  double temp = num2;
				   num2 = num3;
				   num3 = temp;
				  }
				 
				  if (num2 > num1) {
				   double temp = num1;
				   num1 = num2;
				   num2 = temp;
				  }
				 
				  if (num3 > num2) {
				   double temp = num2;
				   num2 = num3;
				   num3 = temp;
				  }
		  }
		 }
}

		 
		 
		 
		
		
	


