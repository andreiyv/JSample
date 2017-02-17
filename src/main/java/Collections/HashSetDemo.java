import java.util.*;

public class HashSetDemo {
    public static void main (String[] args) {
        HashSet<String> hs = new HashSet();

        hs.add("A");
        hs.add("B");
        hs.add("C");

        for (String str: hs) {
            System.out.println(str + "\n");
        }

    }
}
