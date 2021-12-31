
public class WhyMethod {
	
	public static void main(String[] args) {
		printTwoTimes("a");
		printTwoTimes("b");
		printTwoTimes("1");
		
		printTwoTimesA("a", "-");
		printTwoTimesA("b", "*");
		printTwoTimesA("c", "/");
	}
	public static void printTwoTimes(String text) {
		System.out.println("-");
		System.out.println(text);
		System.out.println(text);
	}
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(text);
		System.out.println(delimiter);
	}
	/*public static void printTwoTimesA() {
	System.out.println("-");
	System.out.println("A");
	System.out.println("A");
	}
	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}*/
}
