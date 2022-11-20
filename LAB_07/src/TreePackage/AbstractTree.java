/*

Lab -07 created by Jonathan M. 

This class contains an abstract class, called abtrsact tree which will 
implement the Tree.java interface already created. 
 */
package TreePackage;

import TreePackage.Tree; 
// importing the Tree.java interaface .java file created. 


public  abstract class AbstractTree<E> implements Tree<E> {
    // abstract class created, implementing interface tree. 
    
    @Override 
    public void inorder(){
        
    }
    
    @Override
    public boolean isEmpty(){
        return getSize() == 0; 
    }
    
    
    
}
