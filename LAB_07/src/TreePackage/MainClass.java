/*

This class contains the code in order to run the whole application. 
 */
package TreePackage;

import TreePackage.*; 
// import everything from this local package. 

import java.util.Scanner; 
// scanner class imported. 

public class MainClass {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); 
        // Scanner object of input type created. 
        
        System.out.println("Please enter 10 integers:  ");
        
        BinarySearchTree <Integer> binarySearchTree = new BinarySearchTree<>(); 
        // a new binary search tree object with integer types is created. 
        
        String[] line = input.nextLine().split(" "); 
        
        for(String str : line){
            binarySearchTree.insert(Integer.valueOf(str)); 
        }
        
        System.out.println("The root is: " + binarySearchTree.root.element);
        // this statement accesses the root of the binary search tree. 
        binarySearchTree.inorder(); 
        // print the search tree in an inorder fashion. 
        
        
    }
    
}
