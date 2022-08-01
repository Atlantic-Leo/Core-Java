package collectionsdemo;

import java.util.ArrayList;

public class ArrayList_demo {
	
	//all the class which implements the list interface can accept duplicate values
	
	//ArrayList , LinkedList and Vector -> implements the List interface
	
	//array has fixed size , arraylist has dynamic size
    //we can access and insert any value at any index in arraylist
	
	public static void main(String[] args) {
		
		//arraylist is a class which implements the List interface of Collections framework
		//collections framework is a collection of classes and interfaces
		
		//provide what type of elements you are passing into the aarraylist
		ArrayList<String> a = new ArrayList<String>();
		
		//array list has a dynamic size
		
		a.add("John");
		a.add("Java");
		System.out.println(a);
		
		//we can also add elements in a particular index
		a.add(0,"student");
		
		//removing element at a particular index
		a.remove(1);
		System.out.println(a);
		
		//to get elements at a particular index
		System.out.println(a.get(1));
		
		//to check whether a particular string is present in the array list or not
	    System.out.println(	a.contains("Jack"));
	    
	    //to know the index of a particular string in the arraylist
	    System.out.println( a.indexOf("Java")); 
	    
	    //to check if arraylist is empty or not
	   System.out.println(a.isEmpty()); 
	   
	    //to check the size of the arraylist
	    System.out.println(a.size());
	
	
		
	}

}
