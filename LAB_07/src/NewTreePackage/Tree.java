/*
Lab-07, created by Jonathan M 


Tree Interface created within this java file. 
 */
package NewTreePackage;

/**
Generic tree created below. Extends 
 */
public interface Tree<E> extends Iterable<E> {
    
    public boolean search(E e); 
    //Return a true if an element is within the tree. 
    
    
    public boolean insert(E e); 
    // insert an element into the binary search tree 
    // return a true once element inserted successfully
    
    public boolean delete(E e); 
    // Delete a specified element from a tree. 
    
    
    public void inorder(); 
    // traverse fro root within the inorder method. 
    
    public int getSize(); 
    // return the number of nodes within a tree. 
    
    public boolean isEmpty(); 
    // return true if the tree is empty. 
    
    
    
}
