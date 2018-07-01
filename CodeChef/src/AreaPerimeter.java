import java.util.Scanner;

public class AreaPerimeter {
	public static void main(String [] args) { 
		
		Scanner keyboardInput = new Scanner (System.in);
		
		int length = keyboardInput.nextInt(); 
		
		int width = keyboardInput.nextInt(); 
		
		int perimeter =  2* (length + width);
		int area = length * width;
		
		if (perimeter > area ) { 
			System.out.println("Peri" + "\n" + perimeter); 	
			
	    } 
		
		else { 
		    System.out.println("Area" + "\n" + area);
	}
	
		
	}
}
