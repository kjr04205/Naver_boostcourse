import javax.swing.JOptionPane;

public class Baekjoon_9498 {

	public static void main(String[] args) {
		String examScore = JOptionPane.showInputDialog("What's your exam score?");
		int Score = Integer.parseInt(examScore);
		
		if(Score <= 100 && Score > 0) {
			if(Score >= 90) {
				System.out.println("A���� �Դϴ�.");
			}else if(Score >= 80) {
				System.out.println("B���� �Դϴ�.");
			}else if(Score >= 70) {
				System.out.println("C���� �Դϴ�.");
			}else if(Score >= 60) {
				System.out.println("D���� �Դϴ�.");
			}else {
				System.out.println("F���� �����Դϴ�. �ٽ��ϼ���.");
			}
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
	}

}
