import java.util.Scanner;

public class Baekjoon_2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcdNum = getGcd(a, b);
		
		int lcmNum = (a * b) / gcdNum;
		
		System.out.println(gcdNum);
		System.out.println(lcmNum);
		
		
	}
	private static int getGcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a + b;
	}

}
