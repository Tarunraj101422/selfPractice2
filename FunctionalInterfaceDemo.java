
public class FunctionalInterfaceDemo implements FunctionalInterfaceDemo1 {

	public String Say(String s) {
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceDemo fid = new FunctionalInterfaceDemo();
		fid.Say("Hi Tarun");

	}

}
