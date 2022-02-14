class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	// Overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3;
	}
}
class Cal3 extends Cal{
	public int multiple(int v1, int v2) {
		return v1*v2;
	}
	// Overriding -> �θ� ������ �ִ� ����� ������(�����) - Overriding �θ�Ŭ������ ��ɿ� �ö�Ÿ�°�
	public int sum(int v1, int v2) {
		return super.sum(v1, v2); // super => �θ�
	}
	
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		/*Cal2 c2 = new Cal2();
		System.out.println(c2.sum(3, 10));
		System.out.println(c2.minus(3, 10));*/
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.sum(2, 1, 1)); //Cal(�θ�)�� sum�� ���
		System.out.println(c3.multiple(2, 1));
	}

}
class Cal2 extends Cal{
	
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}