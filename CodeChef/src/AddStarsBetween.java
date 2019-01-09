/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *This program adds stars inbetween same characters/ letters in string.
 * 
 * @author Sher Khan
 */
public class AddStarsBetween {
    
    public static String addStars (String input) { 
        
        //checks if input length is 1  than return input b
        if(input.length() <= 1){ 
            return input;
        }
         
        // checks if index 0th character / letter is equal 1st character / letter 
        // then add star in between those characters
        if (input.charAt(0) == input.charAt(1)) { 
            return addStars(input.charAt(0)+ "*"+input.substring(1));
        }
        
        //else returns the 0th character and repeats the steps again
        // for the first index onwards to find same characters and adds star
        // between them
        else  
            return input.charAt(0) + addStars(input.substring(1)); 
    }
    
    public static void main (String [] args){ 
        
        //Test
        String input = "aabcbbcczdjhs";
        System.out.println(addStars(input));
    }
}
