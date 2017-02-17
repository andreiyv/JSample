import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("a");
        ll.add("b");
        ll.add("c");

        ll.addFirst("_");
        ll.addLast("_");

        System.out.println(ll);
	}

}
