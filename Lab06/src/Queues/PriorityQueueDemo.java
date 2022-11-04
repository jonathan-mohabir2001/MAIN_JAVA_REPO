/*
Understanding Queues in order to then work with Stacks. 
 */
package Queues;


// collections, queues are imported from the Java.Util package. 

import java.util.*;
// all classes imported from the java.util package. 

public class PriorityQueueDemo {
    
    public static void main(String[] args) {

       PriorityQueue<String> queue1 = new PriorityQueue<>(); 
       
        // PriorityQueue object created. 
        
        queue1.offer("New York"); 
        queue1.offer("Dallas"); 
        queue1.offer("New mexico"); 
        queue1.offer("Houston"); 
        System.out.println("viewing this priority queue below:" + queue1.peek());
        System.out.println("The size of this queue: " + queue1.size());
         
        
    }
    
}
