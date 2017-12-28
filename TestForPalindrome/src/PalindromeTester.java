import java.util.Scanner;

public class PalindromeTester {

	public boolean isAPalendrom(int num) {
		String number = Integer.toString(num);
		String numberInReverse = "";
		for(int i = number.length() - 1; i >-1; i--) {
			numberInReverse += number.charAt(i);
		}
		
		if (number.equalsIgnoreCase(numberInReverse)) {
			return true;
		}
		else 
			return false;
	}
	
	public static boolean isParsable(String input){
	    boolean parsable = true;
	    try{
	        Integer.parseInt(input);
	    }catch(NumberFormatException e){
	        parsable = false;
	    }
	    return parsable;
	}
	
	public static void main(String args[]) {
		
		PalindromeTester pal = new PalindromeTester();
		
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		
		while(!input.equalsIgnoreCase("Stop")) {
		System.out.println("Enter a number: "); 
		input = keyboard.nextLine();
		if(pal.isParsable(input)) { 
			int number =  Integer.parseInt(input);
			if(pal.isAPalendrom(number)) {
				System.out.println("The number you entered is a palindrome");
			}
			else 
				System.out.println("The number you entered is not a palindrome");
		}
		else if(!input.equalsIgnoreCase("Stop"))
			System.out.println("Error, you entered invalid input");
		}
		
	}
	
}
