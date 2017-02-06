import java.util.*;
/*
Important Points About LinkedHashSet
-------------------------------------
LinkedHashSet is similar to HashSet that only stores unique values, that is duplicate values are not allowed.
LinkedHashSet maintains insertion order, which means it returns the elements in the order in which they are added.
It does not do any kind of sorting to the stored values.
LinkedHashSet is similar to HashSet which allows only one null value in it, As duplicates are not allowed.
LinkedHashSet uses hash table to store the values.
*/

// http://javaconceptoftheday.com/java-linkedhashset-example/
// http://javaconceptoftheday.com/how-linkedhashset-works-internally-in-java/


class Customer
{
    String name;
    int id;

    public Customer(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public boolean equals(Object obj)
    {
        Customer customer = (Customer) obj;

        return (id == customer.id);
    }

    @Override
    public String toString()
    {
        return id+" : "+name;
    }
}

public class LinkedHashSetDemo {
    public static void main (String[] args) {
        //Creating LinkedHashSet

                LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();

                //Adding elements to LinkedHashSet
                set.add(new Customer("Jack", 021));
                set.add(new Customer("Peter", 105));
                set.add(new Customer("Ramesh", 415));
                set.add(new Customer("Julian", 814));
                set.add(new Customer("Avinash", 105));      //Duplicate Element
                set.add(new Customer("Sapna", 879));
                set.add(new Customer("John", 546));
                set.add(new Customer("Moni", 254));
                set.add(new Customer("Ravi", 105));        //Duplicate Element

                //Getting Iterator object
                Iterator<Customer> it = set.iterator();

                while (it.hasNext())
                {
                    Customer customer = (Customer) it.next();
                    System.out.println(customer);
                }
            }
}
