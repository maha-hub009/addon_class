package Exceptional;
import java.util.Arrays;
public class ExceptionalHandling {
	public static void main (String[] arg) {
	int num1=10;
	int num2=3;
	int[ ] arr= new int[7];
	try {
		int num3 = num1/num2;
		arr[1]=18;
	}catch(ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }catch(ArithmeticException e) {
    	System.out.println("infinity");
	}finally{
	System.out.print(Arrays.toString(arr));
	}
  }
}