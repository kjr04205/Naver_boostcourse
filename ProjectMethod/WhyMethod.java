import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	
	public static void main(String[] args) throws IOException {
		System.out.println(twoTimes("a","-"));
		
		FileWriter fw2 = new FileWriter("out.txt");
		fw2.write(twoTimes("a","hyoin"));
		fw2.close();
		
		writeFileTwoTimes("a","*");
		
		printTwoTimes("a");
		printTwoTimes("b");
		printTwoTimes("1");
		
		printTwoTimesA("a", "-");
		printTwoTimesA("b", "*");
		printTwoTimesA("c", "/");
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
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
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
	}
	
}
