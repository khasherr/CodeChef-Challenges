/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 * This program checks if a String is Palidrome. 
 * Palidrome is a phrase that is read same backward as forward. 
 * Example: abcba, madam, nurse run etc. 
 * 
 * 
 * @author Sher Khan
 */
public class Palidrome {
    
    public static boolean checkPalidrome(String input){ 
        
        //checks if string length is equal to one or zero and returns 
        // true because it is palidrome
        if((input.length() == 1) || (input.length() == 0)){ 
            return true;
        }
        
        //compares index of first and last character value to each other 
        //if not equal returns false. For palidrome first and last character 
        // in a string must equal to each other.
        if ((input.charAt(0)) != (input.charAt(input.length()-1))) {
            return false;
        } 
        
        // repeats the process. The substring method creates new string 
        // from index 1 to index of second last. Calls the checkPalidrome on them
        // repeats the same process but with index 1 and 2nd last index.
        else 
            return checkPalidrome(input.substring(1, input.length()-1));
        }
     
    
     public static void main (String [] args) { 
         
         //test
         String input = "abcba"; // true
         String input2 = "abcdl"; // false
         
         System.out.println(checkPalidrome(input));
         System.out.println(checkPalidrome(input2));
     }



}