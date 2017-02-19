import java.util.Scanner;
public class Chapter18Exercise {

	public static void main(String[] args) {
    //Print the characters in a string reversely
		
		System.out.print("Enter a string: ");//Prompt the user to enter a string and displays the reversal
        String value = new Scanner(System.in).nextLine();
        reverseDisplay(value);

    }

    public static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
    }

	}


