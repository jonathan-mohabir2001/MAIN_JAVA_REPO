/*
Understanding the concepts of collections, lists, hashlist, etc. 
 */
package Intro;
import java.util.Collection; 
import java.util.Map; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Stack;

// picture three games in their covers stacked onto each other. 
// Call of duty, guitar hero, Super Monkey ball 
// FIRST in LAST out. 

public class Main {

    public static void main(String[] args) {        
    
        
        
        Stack<String> games = new Stack<String>(); 
         //a new stack is created as a Stack object. 
         // data hiding is accomplished with the String passed a variable
         // this ensures type erros which may occur. 
         
         games.add("Call of Duty"); // bottom of stack 
         games.add("Guitar hero"); // middle of stack 
         games.add("Super monkey ball"); // top of stack.
         
         System.out.println("Printing the whole stack before pop" + games);
        // prints all of the stack  System.out.println(games);
         
        System.out.println(games.pop()); 
        // very top of stack is popped. 
        System.out.println("Games now updated after pop" + games);
         
        System.out.println("Peeking into top of stack" + games.peek());
        
         
        
        
        
    }
    
}
