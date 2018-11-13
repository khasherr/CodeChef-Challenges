/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Sher Khan
 */
public class SumArrays {
    public static int sum (int input[], int index){
    
        // Base case.  If the index is equal to the length of the array, we
        // know that all of the array elements have been processed.
        if (index == input.length){ 
        return 0 ;
    }
        // This method calls itself with a index argument that is one higher
        // than the current index.  The result of the method call is added
        // to the array element at index.
    
    return sum (input, index+1) + input[index];
        
    }
    
    public static void main (String args []){ 
        int input[] = {2,3,6};
        System.out.println(sum(input,0));
    }
}
