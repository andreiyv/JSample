import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListDemo{

    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<Integer>();;
        int sum = 0;
        int sum1 = 0;

        for (int i=0; i < 1000; i++){
            lst.add(i);
        }

        for (int n: lst){
            sum = sum + n;
        }

        for (int n=0; n < lst.size(); n++ ){
          sum1 = sum1 + lst.get(n);
        }

        System.out.println("ArrayListDemo, summ of all elements:" + sum + ", " + sum1);
    }

}
