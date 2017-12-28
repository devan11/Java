//This class calculates the Nth number in the Fibonacci Sequence.
import java.util.*;
public class FibonacciTester {

	public int computeNthFibonacciNumber (int n) {
		if( n == 1 || n == 2)
		return 1;
		
		
		else
		    return computeNthFibonacciNumber(n - 1) + computeNthFibonacciNumber(n-2);
	}

	public boolean isParsable(String s ) {
		boolean parsable =true;
		try {
			int n = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			parsable = false;
		}
		return parsable;
	}
	
	
	public static void main(String args[]) {
		FibonacciTester fib = new FibonacciTester();
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		while(!input.equalsIgnoreCase("stop")) {
			System.out.println("Enter a number: ");
			input = keyboard.nextLine();
			if(!fib.isParsable(input) && !input.equalsIgnoreCase("stop")) {
				System.out.println("Error, invalid entry");
			}
			else if (fib.isParsable(input)){
				int n = Integer.parseInt(input);
				int number = fib.computeNthFibonacciNumber(n);
				System.out.println("The " + n + "th fibonacci number is: " + number);
			}
		}
		
	}
	
		
		
	}

