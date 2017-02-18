
public class Chapter18Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("The fibonacci(10) is " + fib(10));
	  }

	  public static long fib(int n) {
	    int f0 = 0, f1 = 1, currentFib;

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


