/*
Abstract tree created within this file. 

This abstract tree will implment the Tree.java file already created within 
this Java Project .
 */
package NewTreePackage;


public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public void inorder(){
        
    }
  
    @Override
    public boolean isEmpty(){
        return getSize() == 0; 
    }
    
}