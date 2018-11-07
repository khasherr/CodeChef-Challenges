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
public class FirstIndex {
    public static int firstIndexCalc(int input[], int x, int startIndex){ 
        if(startIndex == input.length){ 
            return -1;
        }
        if (input[startIndex] == x){ 
            return startIndex;
        }
        
        return firstIndexCalc(input, x, startIndex+1);
        
        
    }
    
    public static int firstIndexCalc(int input[], int x){ 
        return firstIndexCalc(input, x, 0);
    }
    
    public static void main (String [] args){ 
        int input[] = {1,5,6,7};
        System.out.println(firstIndexCalc(input,8));
    }
    
}
