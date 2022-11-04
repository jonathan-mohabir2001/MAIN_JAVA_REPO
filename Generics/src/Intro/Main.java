/*

Understanding Generics. 

Generics is used to specify types to helop with 
detecting erros at runtime. 

*/
package Intro;


import java.util.ArrayList; 


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> newList = new ArrayList<>(); 
        
        newList.add("Hello"); 
        newList.add("World"); 

        System.out.println("Array list: " + newList);        
        
    }
    
}
