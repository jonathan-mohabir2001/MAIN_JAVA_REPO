/*
Lab-07, created by Jonathan M 

Generic Stack created in this file. 
This file contains methods in order to implement working with a stack 
inside of a Binary search tree. 

*/
package NewTreePackage;

public class NewStack <E> {
        
    private java.util.ArrayList <E> list = new java.util.ArrayList<>(); 
    // array list object list created. 
    
    public int getSize(){
        return list.size(); 
    }
    // method to return size of list. 
    
    public E peek(){
        return list.get(getSize() - 1); 
    }
    // peek method to peek into list object
    
    public void push(E o ){
        list.add(o);
    }
    // push method created.
    
    public E pop(){
        E o = list.get(getSize() - 1 ); 
        list.remove(getSize() - 1);
        return o;
    }
    // pop method created. 
    
    public boolean isEmpty(){
        return list.isEmpty(); 
    }
    // return boolean value if the list is empty. 
    
    @Override 
    public String toString(){
        return "Stack:" + list.toString(); 
    }
    

    
}
