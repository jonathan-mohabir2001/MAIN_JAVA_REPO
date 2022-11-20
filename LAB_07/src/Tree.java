/*
This class contains the methods for which this tree will contain. 

*/


public interface Tree<E> extends Iterable<E> {
    
    public boolean search(E e); 
    // This returns a true if there is an element within a tree. 
    
    public boolean insert(E e); 
    // insert element e into the binary search tree. 
    
    public boolean delete(E e); 
    // delete a specified element from the tree. 
    
    
    public void inorder(); 
    // Post order reversal method required for this lab is defined. 
    
    
    public int getSize(); 
    // this method returns the number of nodes within the tree. 
    
    public boolean isEmpty(); 
    // return a true if the tree is empty. 
}
