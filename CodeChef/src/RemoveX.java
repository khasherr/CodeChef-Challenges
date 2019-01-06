/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 * This program removes character 'x' from a string recursively.
 * 
 * @author Sher Khan
 */
public class RemoveX {
    
    public static String removeX (String str){
       
        //This is base case - if the string is empty returns empty string
        if (str.isEmpty()) { 
            return " ";
        }
        
        //Assumed that answer is empty
        String answer = " " ; 
        
        
        //If the string at 0th character does not equal character 'x' 
        // then added the character to the answer
        if (str.charAt(0) != 'x'){ 
            answer = answer + str.charAt(0);
        }
 
        // Recursive step does the work for next character and adds the answer to smallAnswer
         String smallAnswer = removeX(str.substring(1));
           return answer+ smallAnswer;
    }
    
     public static void main(String [] args){ 
       
        //Testing the above method
        String str = "xabcxz";
        System.out.println(removeX(str));
                
    }
    
}
