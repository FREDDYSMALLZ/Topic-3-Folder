import java.util.Scanner;
public class Chapter4Exercise {

	public static void main(String[] args) {
		// Financial application: Payroll

		  Scanner input = new Scanner(System.in);
		  
		  //Prompts the user to enter the employee name
		  
		  System.out.print("Enter employee name:"); // Name takes a string type input
		  String name = input.nextLine();
		  
		  //Prompts the user to enter the number of hours worked in a week
		 
		  System.out.print("Enter number of hours worked in a week:");
		  double hours = input.nextDouble();
		  System.out.print("Enter hourly pay rate:");// Enter the pay rate per hour
		  double rate = input.nextDouble();
		  System.out.print("Enter federal tax withholding rate:");//Enter FED Withholding taxes
		  double FEDtaxRate = input.nextDouble();
		  System.out.print("Enter state tax withholding rate:");// Enter the state withholding taxes
		  double STtaxRate = input.nextDouble();
		  System.out.println("Employee Name :" + name);//Prints the name of the employee
		  System.out.println("Hours Worked :" + hours);//Prints the hours worked by employee
		  System.out.println(" Hourly pay rate:" + " is $" + rate);
		  
		  double grosspay = rate * hours ;
		  double fedWithHolding = ((FEDtaxRate) * grosspay);
	      double stateWithHolding = ((STtaxRate) * grosspay);
	      double totalDeduction = fedWithHolding + stateWithHolding;
	      double netPay = grosspay - totalDeduction;
	      
	      System.out.println("  Federal Withholding (" + (double)FEDtaxRate + "%): $" + fedWithHolding);
	      System.out.println("  State Withholding (" + (double)STtaxRate + "%): $" + stateWithHolding);
	      System.out.println("  Total Deduction: $" + totalDeduction);
	      System.out.println("Net Pay: $" + netPay);
	}
}
		 
		  

	


