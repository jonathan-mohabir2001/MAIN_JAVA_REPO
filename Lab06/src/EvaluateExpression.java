/*
Lab -06 created by Jonathan M 
CPAN-211 
*/

import java.util.*; 

public class EvaluateExpression {
    
    public static void main(String[] args){
        
        ArrayList<String> firstCollection = new ArrayList<>(); 
        // first arraylist object created. 
        firstCollection.add("Toronto"); 
        firstCollection.add("New York"); 
        firstCollection.add("Miami"); 
        firstCollection.add("Dubai"); 
        
        System.out.println("Find the list of places in collection 01");
        System.out.println(firstCollection); 
        
        System.out.println("Is there something called toronto in the system?");
        System.out.println("Find out here:" + firstCollection.contains("Toronto"));
        // this method looks for a specific value. 
       
       firstCollection.remove("Dubai"); 
        System.out.println("See the result of the cities now after removing one \n" +
                firstCollection.size());
        // remove method and size method as well. 
        
        // practising forEach methods when iterating through elements inside 
        
        firstCollection.forEach(e -> System.out.println(e.toUpperCase() + ""));
        // for each element within the collection, they will be turned to uppercases
        
        ArrayList<Integer> numberList = new ArrayList<>(); 
        
        numberList.add(1); 
        numberList.add(2); 
        numberList.add(3); 
        numberList.add(4);
        // 4 numbers created into an array list 
        

        
        
        
        
    }    
}



