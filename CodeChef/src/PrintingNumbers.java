/*
This program prints number 1 - n recursively

 */
package recursion;

/**
 *
 * @author Sher Khan
 */
public class PrintingNumbers {
    public static void  print(int n){
        
        //if n is 0 then do not do anything just return
        if(n == 0){
            System.out.println(n + " ");
        return;
}        
        //else print recursive n-1
         print(n - 1);
         System.out.println(n+ " ");
	}		

    public static void main (String [] args){ 
             print(6);
    }

}

