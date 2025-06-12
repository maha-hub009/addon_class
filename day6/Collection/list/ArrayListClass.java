package Collection.list;

import java.util.ArrayList;
import java.util.Collections;

class ArrayListClass {
    public static void main(String args[]) {
        int[] age = new int[5];
 // Creating and populating the ArrayList
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(100);
        alist.add(200);
        alist.add(300);
        alist.add(400);
 // Modifying an element
        alist.set(3, 10);
// Printing original list
        System.out.println("Original list: " + alist);
 // Sorting the list
        Collections.sort(alist);
// Printing sorted list
        System.out.println("Sorted list (ascending): " + alist);
// descending order
        Collections.sort(alist, Collections.reverseOrder());
        System.out.println("Sorted list (descending): " + alist);
    }
}
