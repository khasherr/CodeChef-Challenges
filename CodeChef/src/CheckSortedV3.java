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
public class CheckSortedV3 {
    private static boolean checkSortedBetter(int input[], int startIndex){ 
        if(startIndex >= input.length){ 
            return true;
        }
        if (input[startIndex] > input[startIndex +1]){ 
            return false;
        }
        
        boolean smallAns = checkSortedBetter(input,startIndex+1); 
        return smallAns;
    }
    
    public static boolean checkSortedBetter(int input[]) { 
        return checkSortedBetter(input,0);
    }
    
    
    public static void main (String args[]){ 
        int input[] = {3,4,1,5,6}; 
        System.out.println(checkSortedBetter(input));
        
    }
}
