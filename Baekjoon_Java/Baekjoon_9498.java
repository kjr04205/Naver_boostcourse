import javax.swing.JOptionPane;

public class Baekjoon_9498 {

	public static void main(String[] args) {
		String examScore = JOptionPane.showInputDialog("What's your exam score?");
		int Score = Integer.parseInt(examScore);
		
		if(Score <= 100 && Score > 0) {
			if(Score >= 90) {
				System.out.println("A학점 입니다.");
			}else if(Score >= 80) {
				System.out.println("B학점 입니다.");
			}else if(Score >= 70) {
				System.out.println("C학점 입니다.");
			}else if(Score >= 60) {
				System.out.println("D학점 입니다.");
			}else {
				System.out.println("F학점 낙제입니다. 다시하세요.");
			}
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
	}

}
