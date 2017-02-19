import java.util.Scanner;
public class Chapter4Exercise {

	public static void main(String[] args) {
		//Prompt the user to enter integer values between 0-15

		
		System.out.print("Enter a decimal value (0 to 15): ");
		  Scanner input = new Scanner(System.in);
		  int i = input.nextInt();
		 
		  if (i < 0 || i > 15) {            //Using the if statements
		   System.out.println(i + " is a false input ");
			   
		   }
		  else{
			  
		  }
		System.out.println("The hex valid value is " // Displays the corresponding true value 
		    + Integer.toHexString(i).toUpperCase());
		 
		 }
	
}
		 
		
	


