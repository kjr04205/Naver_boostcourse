
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		
		int[] scores = {10,20,30};
		
		//Exception
		try {
			System.out.println(2);
			System.out.println(scores[4]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("�߸��� ����Դϴ�. : "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�� �迭�� ���̴� "+scores.length + "�Դϴ�. �������ּ���.");
		}
		
		System.out.println(5);
	}

}
