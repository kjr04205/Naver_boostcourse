
public class AuthApp3 {

	public static void main(String[] args) {
		/*String[] users = {"egoing", "hyoin", "rahee"};
		String inputId = args[0];*/
		
		String[][] users = {
				{"egoing", "1111"},
				{"hyoin", "2222"},
				{"rahee", "3333"}
		};
		String inputId = args[0];
		String inputPw = args[1];
		
		boolean isLogined = false;
		for(int i=0, j=0; i<users.length; i++) {
			String[] current = users[i];
			if(current.equals(inputId) && current.equals(inputPw)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master !");
		}else {
			System.out.println("Who are you?");
		}
	}

}
