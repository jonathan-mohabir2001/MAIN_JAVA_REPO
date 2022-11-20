/*
A generic Stack is created below in order to have the binary 
search tree push values into a stack. 


 */
package TreePackage;

import TreePackage.*; 
// importing everything from this Package. 

public class NewStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>(); 
    // a list object of the array list type is created. 
    
  
    public int getSize(){
        return list.size();
    }
    // method to return size of the stack. 
    
    public E peek(){
        return list.get(getSize() - 1); 
    }
    // peek method created. 
    
    public void push (E o){
        list.add(o);
    }
    // push method to add elements into a stack. 
    
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
    
        
        
    
    
  
    
}
