import java.util.Scanner;

public class Remainder {
	public static void main (String [] args) { 
		
		Scanner keyboardInput = new Scanner(System.in);
		int testCase = keyboardInput.nextInt();
		int numberA, numberB;
		
		for(int counter=0; counter < testCase; counter++) { 
		    numberA = keyboardInput.nextInt(); 
			numberB = keyboardInput.nextInt();
			int remainder = numberA % numberB;
			System.out.println(remainder);
		}
	}

}
