
public class Chapter18Exercise {

	public static void main(String[] args) {
		// Fibonacci numbers
		//Rewrite the fibonacci method in Listing 18.2
		//Prompt the user to enter an index 
		 System.out.println("The fibonacci is " );
	  }

	  public static long fib(int n) {
	    int f0 = 0,//For fib(0)
	    	f1 = 1,//For fib(1)
	    	currentFib;

	    if (n == 0) return 0;
	    if (n == 1) return 1;

	    for (int i = 2; i <= n; i++) {
	      currentFib = f0 + f1;
	      f0 = f1;
	      f1 = currentFib;
	    }

	    return f1;
	  }
	
	}


