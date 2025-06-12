package Collection.Set;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String args[]) {
        int[] pen = new int[5]; // Unused in this context, but declared as in your original code

        // TreeSet automatically sorts elements in natural order (ascending)
        TreeSet<Integer> alist = new TreeSet<>();

        // Adding elements to the TreeSet
        alist.add(300);
        alist.add(100);
        alist.add(200);
        alist.add(400);
        alist.add(100); // Duplicate - will not be added

        // Printing the TreeSet (automatically sorted, no duplicates)
        System.out.println("Sorted TreeSet (no duplicates): " + alist);
    }
}
