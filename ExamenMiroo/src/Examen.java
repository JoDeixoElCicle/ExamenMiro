
public class Examen {
	public static void main(String[]args) {
		printOne();
		printOne();
		printTwo();
	}
	public static void printOne() {
		System.out.println("hello world");
	}
	public static void printTwo() {
		printOne();
		printOne();
	}
}
