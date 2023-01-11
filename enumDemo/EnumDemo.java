package enumDemo;

public enum EnumDemo {

	FZS, MT200, RC290;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDemo e = EnumDemo.FZS;
		EnumDemo e1 = EnumDemo.MT200;
		System.out.println(e);
		System.out.println(e1);

		switch (e1) {
		case FZS:
			System.out.println("Mine");
			break;
		case MT200:
			System.out.println("Wanted to buy");
			break;
		case RC290:
			System.out.println("Waste of money");
			break;
		default:
			System.out.println("Bike is mandatory");
		}
	}
}
