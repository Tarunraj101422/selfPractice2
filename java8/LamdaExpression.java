package java8;

public class LamdaExpression implements Functional{
	public int run(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaExpression le = new LamdaExpression();
		le.run(10, 5);
		
	
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
