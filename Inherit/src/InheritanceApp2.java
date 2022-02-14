class CalA{
	int v1, v2;
	CalA(int v1, int v2){
		System.out.println("Cal init!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
}
class CalC extends CalA{

	CalC(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!");
	}
	public int minus() {
		return this.v1-v2;
	}
	
}

public class InheritanceApp2 {

	public static void main(String[] args) {
		CalA c = new CalA(2,1);
		CalC c3 = new CalC(2, 1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());
	}

}
