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
public class CheckSortedV2 {
    public static boolean checkSorted(int input[]){ 
        if (input.length <= 1){ 
            return true; 
        }
        
        if (input[0] > input[1]){
            return false;
        }
        
        int smallInput[] = new int [input.length-1]; 
        for (int i = 1; i< input.length; i++){ 
            smallInput[i-1] = input[i];
        }
        
        boolean smallAns = checkSorted(smallInput);
                return smallAns;
    }
    
    public static void main (String [] args) { 
        int input[] = {2,3,4,6}; 
        System.out.println(checkSorted(input));
        
    }
}
