import java.util.Scanner;
public class Chapter4Exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    //Prompts the user to enter the first point, Latitude and Longitude(x1, y1)
	    System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
	    double x1 = input.nextDouble();
	    double y1 = input.nextDouble();
	    
	    //Prompts the user to enter the second point, Latitude and Longitude(X2, y2)
	    System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
	    double x2 = input.nextDouble();
	    double y2 = input.nextDouble(); 
	    
	    //Using the formula, calculate the Great circle distance
	    //The average earth radius is 6371.01 kilometers
	    
	    
	    double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
	      Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
	      Math.cos(Math.toRadians(y1 - y2)));
	    
	    System.out.println("The distance between the two points is " + d + " km");
	  }
	

	}

