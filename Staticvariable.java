package newproject;

public class Staticvariable {
	static int var=0;
	static {
		System.out.println("This is a static block");
		var=10;
	}
	static void staticMethod() {
		System.out.println("This is a static method");
	}
	public static void main(String[]args) {
		System.out.println("Inside main method");
		System.out.println("Value of static var:"+var);
		staticMethod();
	}
}
