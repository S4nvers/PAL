package rechner;

public class Log {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.err.println("Error Test");
		test(5);
	}
	
	public static int test(int x) {
		System.out.println("Test function called with " + x);
		
		return x*x;
	}
}
