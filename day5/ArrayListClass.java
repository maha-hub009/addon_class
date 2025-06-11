package day5;
import java.util.ArrayList;
public class ArrayListClass {
	 public static void main(String[] arg) {
	        int[] age =new int[5];
	        ArrayList<Integer> aList = new ArrayList<>();
	        aList.add(100);   // Adds Long 100 to the list
	        aList.add(200);
	        aList.add(300);
	        aList.add(2,40);
	        aList.set(3,35);
	        System.out.println(aList);  // Prints 100

	 }
}
