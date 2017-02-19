import java.util.Scanner;
public class Chapter6Exercise {

	public static void main(String[] args) {
		//Compute future investment value
		//Using the formula in Exercise 2.21
		//Future invest value=InvestmentAmount*(1+monthlyInterestRate)^number of years*12
		
          Scanner input = new Scanner(System.in);//Create a Scanner
          
          System.out.print("Enter Investment amount: ");//Prompt the user to enter an investment amount
          double InvestmentAmount = input.nextDouble();

          System.out.print("Enter annual interest rate: ");//Prompt the user to enter the annual interest rate% 
          double annualInterestRate = input.nextDouble() / 100;

          System.out.print("Enter number of years: ");//Prompt the user to enter the number of years for investment
          int years = input.nextInt();
              
	}


public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

return investmentAmount *  Math.pow((1 + monthlyInterestRate), (years * 12));
}
}

