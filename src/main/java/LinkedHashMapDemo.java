import java.util.*;

/* 
This implementation differs from HashMap in the way that it maintains a doubly-linked list running through all of its entries. 
This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map. 
The insertion order is not affected if a key is re-inserted into the map. 
Performance of LinkedHashMap is slightly below than that of HashMap, due to the added expense of maintaining the linked list.
*/



public class LinkedHashMapDemo {

    public static void main (String[] args) {


        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put("b", new Integer(2));
        lhm.put("c", new Integer(3));   
        lhm.put("a", new Integer(1));   


        System.out.println("LinkedHashMapDemo");

        // Make some modifications
        int val = (int) lhm.get("a");
        lhm.put("a", new Integer(val + 1));

        // Iterating or looping map using Java5 foreach loop
        // Here we will use new foreach loop introduced in JDK5 for iterating over any map in java and 
        // using KeySet of map for getting keys. this will iterate through all values of Map and display key and value together.
        // http://javarevisited.blogspot.ru/2011/12/how-to-traverse-or-loop-hashmap-in-java.html
        for (Object key: lhm.keySet() ) {
            System.out.println(key + ":" + lhm.get(key));
        }


    }
}

