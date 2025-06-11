package OOPS_DAY4;
import java.util.Date;
import java.util.Scanner;
public class Oopsclass {
public static void main(String[]arg) {
	Encapsulation user= new Encapsulation(); {
//	for email
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your Email: ");
		user.setEmail(sc.next());
		System.out.println(user.getEmail());
//for mobile no
		System.out.println("Enter your mobile no: ");
		user.setMobile(sc.nextLong());
		System.out.println(user.getMobile());
		System.out.println(" ");
//for age
		System.out.println("enter your age: ");
		Date age = new Date(sc.next());
		user.setAge(age);
		System.out.println(user.getAge());
		System.out.println(" ");
//graduate
		System.out.println("enter if you are graduate or not: ");
		user.setGraduate(sc.nextBoolean());
		System.out.println(user.isGraduate());
		System.out.println(" ");
		}
	}
}