import org.opentutorials.iot.*;
public class OkJavaGoInHome {
	public static void main(String[] args) {
		String myAPT = "Hyoin House";
		// Elevator call
		Elevator myElevator = new Elevator(myAPT+"\n");
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(myAPT+"\n");
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(myAPT + " / hallLamp\n");
		hallLamp.on();
	}
}
