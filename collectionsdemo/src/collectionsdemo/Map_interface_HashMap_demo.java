package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_interface_HashMap_demo {
	
	//multiple threads can access hashmap at once
	//multiple threads cannot access hashtable at once
	//hashmap allows any number of null keys and null values but hashtable wont allow null keys and null values
	//hashmap uses iterator interface to travese thorugh the values in a set whereas iterator interface cannot be used for hashtable , a separate interface called enumerator should be used
	
	public static void main(String[] args) {
		
		//HashMap , HashTable classes implements Map interface
		
		//HashMap takes values in the form of key-value pair
		
		//HashMap hm = new HashMap();
		
		//give the type of key and value
		
		//HashTable is similar to HashMap , just replace hashmap with hashtable
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"Hello");
		hm.put(2,"Hi");
		hm.put(3,"morning");
		hm.put(4,"evening");
		hm.put(5,"afternoon");
		hm.put(6,"night");
		
		//getting the element of a particular key
		System.out.println(hm.get(2));
		
		//removing elements
		hm.remove(2);
		
		System.out.println(hm.get(2));
		
		//converting HashMap into Set
		//the key and value pairs will be stored in the set combined
		
		Set sn = hm.entrySet();
		
		//using iterator to traverse through the set
		//mention type of elements present in the set to the iterator
		//Iterator<String> it = sn.iterator();
		
		//we are trying to separate the key and value pair of the map by using map.entry , so no need to use Iterator<String>
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			//can't use it.next() here simply as the values are stored in key-value pairs , it will be confused what to extract
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}

}
