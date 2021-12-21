import org.opentutorials.iot.*;

public class OkJavaGoInHomeInput {
	// parameter, 매개변수
	public static void main(String[] args) {
		//Java Swing
		//String myAPT = JOptionPane.showInputDialog("Enter a myAPT");
		//String bright = JOptionPane.showInputDialog("Enter a bright");
		
		String myAPT = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(myAPT+"\n");
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(myAPT+"\n");
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(myAPT + " / hallLamp\n");
		hallLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(myAPT + " moodLamp\n");
		moodLamp.setBright(Double.parseDouble(bright));
		
		moodLamp.on();
	}
}
