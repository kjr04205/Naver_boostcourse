
public class AuthApp {

	public static void main(String[] args) {
		String id = "egoing";
		String inputId = args[0];
		
		String password = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		/*if(inputPass == password) {
			System.out.println("Master!");
		}else {
			System.out.println("Who are you?");
		}*/
		
		if(inputId.equals(id) && inputPass.equals(password)) {
			System.out.println("Master");
		}else {
			System.out.println("Who are you?");
		}
	}

}
