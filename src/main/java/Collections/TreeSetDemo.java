import java.util.*;

public class TreeSetDemo {
    public static void main (String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(12);
        ts.add(63);
        ts.add(34);
        ts.add(45);

        Iterator<Integer> iterator = ts.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
