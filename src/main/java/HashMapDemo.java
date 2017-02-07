import java.util.*;

public class HashMapDemo {

	public static void main (String[] args) { HashMap hm = new HashMap();

		hm.put("a", new Integer(1));   
                hm.put("b", new Integer(2));
		hm.put("c", new Integer(3));   

		Set set = hm.entrySet(); 

		System.out.println("HashMapDemo");

		System.out.println(set);

		// Iteruting thrue HashMap, Method 1
		Iterator i = set.iterator();

		while (i.hasNext()) { 
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ":" + me.getValue());
		}

// Make some modifications
      int val = (int) hm.get("a");
      hm.put("a", new Integer(val + 1));

		// Iterating or looping map using Java5 foreach loop
		// Here we will use new foreach loop introduced in JDK5 for iterating over any map in java and 
		// using KeySet of map for getting keys. this will iterate through all values of Map and display key and value together.
		// http://javarevisited.blogspot.ru/2011/12/how-to-traverse-or-loop-hashmap-in-java.html
		for (Object key: hm.keySet() ) {
			System.out.println(key + ":" + hm.get(key));
		}


	}
}

