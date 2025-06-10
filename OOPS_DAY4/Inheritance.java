package OOPS_DAY4;

class Parent{
	String haircolor="black";
	void behaviour() {
		System.out.println("Attitude");
	}
}
class Child extends Parent{
	void behaviour() {
		System.out.println("less Attitude");
	}
}
public class Inheritance {
	public static void main(String[]arg){
	Parent obj = new Child();
	obj.behaviour();
	}
}
