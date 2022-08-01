package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Set_interface_HashSet_demo {
	
	public static void main(String[] args) {
		
		//HashSet , treeset and LinkedHashSet classes implements Set interface
		//Set interface does not accept duplicate values
		//elements will not be stored in sequential order
		
		//tell the type of elements to put in the hashset
		//HashSet hs = new HashSet();
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("John");
		hs.add("Jack");
		hs.add("John");
		hs.add("Jane");
		hs.add("he");
		hs.add("she");
		hs.add("it");
		hs.add("they");
		
		
		System.out.println(hs);
		
		//removing a particular string
		hs.remove("Jane");
		
	System.out.println(hs.isEmpty());	
	
	System.out.println(hs);
		
		System.out.println(hs.size());
		
		
		//hashset with iterator
		//iterator is used to traverse through the hashset
		//we need to create a object for the iterator and it points through the indexes of the hashset using the next() method
		//hs.iterator();
		
		//mention type of elements present in the set to the iterator
		Iterator<String> i = hs.iterator();
		
		//hasNext() method checks whether the next index is present or not 
		
		System.out.println(i.next());
		System.out.println(i.next());
		
		//the i.next() continues from John
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
