import java.util.Scanner;

public class Sum_Difference {

	public static void main (String [] args ) { 
		
	 Scanner keyboardInput = new Scanner(System.in); 
	 
	 int number1 = keyboardInput.nextInt(); 
	 int number2 = keyboardInput.nextInt(); 
	 int sum;
	 int difference; 
	 
	 if (number1>number2) { 
		 sum = number1+number2; 
		 System.out.println(sum);
	 } else { 
		 difference = number1- number2; 
		 System.out.println(difference);
	 }
	} 
}
			

