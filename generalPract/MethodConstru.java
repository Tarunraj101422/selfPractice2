package generalPract;

public class MethodConstru {
	int number;

	MethodConstru() {
		System.out.println("Constructor");
	}

	MethodConstru(int number) {
		this.number = number;
		System.out.println("Number "+number);
	}

	public int m1(int number) {
		System.out.println("Method " + number);
		return this.number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodConstru mc = new MethodConstru(20);
		mc.m1(15);
	}

}
