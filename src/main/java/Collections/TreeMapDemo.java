import java.util.*;

public class TreeMapDemo {

    public static void main (String[] args) {


        TreeMap tm = new TreeMap();

        tm.put("b", new Integer(2));
        tm.put("c", new Integer(3));   
        tm.put("a", new Integer(1));   

        System.out.println("TreeMapDemo");

        // Make some modifications
        int val = (int) tm.get("a");
        tm.put("a", new Integer(val + 1));

        // Iterating or looping map using Java5 foreach loop
        // Here we will use new foreach loop introduced in JDK5 for iterating over any map in java and 
        // using KeySet of map for getting keys. this will iterate through all values of Map and display key and value together.
        // http://javarevisited.blogspot.ru/2011/12/how-to-traverse-or-loop-hashmap-in-java.html
        for (Object key: tm.keySet() ) {
            System.out.println(key + ":" + tm.get(key));
        }


    }
}

