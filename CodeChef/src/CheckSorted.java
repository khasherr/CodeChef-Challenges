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
public class CheckSorted {
    public static boolean checkSorted (int input[]){ 
        
        // base case to check if the legth of array is either zero or 1 
        // which means it is already sorted
        if(input.length <= 1){ 
            return true;
        }
        
        //otherwise created smallInput array 
        // to copy the input array -1 except for the zero index
        int smallInput [] = new int [input.length -1];
        for ( int i=1; i<input.length; i++){ 
            smallInput [i-1] = input[i];
        }
        
        //put the result into smallAns
        boolean smallAns = checkSorted(smallInput);
        
        // if smallAns is not true 
        if(!smallAns){ 
            return false;
        }
        
        // if the value at index[0] is either less OR equal to value
        // of index at input[1]  then return true 
        // this means that value at index[0] can not be greater
        // than the value at index[1] 
         if (input[0]<= input[1]) {
        return true;
       }
        else { 
            return false;
        }
    }
    
    public static void main (String[] args){ 
        int input[] = {2,3,4,5}; 
        System.out.println(checkSorted(input));
    }
}
