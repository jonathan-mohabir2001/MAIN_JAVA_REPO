/*
Lab 07 created by Jonathan M. 
This class contains an interface called tree. 
This will contain some methods in order to work with binary search trees. 

INTERFACE: empty methods, which are overrided inside of the other classes which 
implement it. 

*/
package TreePackage;


public interface  Tree<E> extends Iterable<E> {
    
    public boolean search (E e); 
    // return a true if there is an element within the tree 
    
    public boolean insert (E e); 
    
    //Insert an element represented by e, into the binary search tree. 
    
    public boolean delete(E e); 
    
    public void inorder(); 
    // traverse from the root in an inorder fashion. 
    
    public int getSize(); 
    // return the number of nodes within a tree. 
    
    public boolean isEmpty(); 
    // return a true if the tree is empty. 
    

    
    
    
    
    
}
