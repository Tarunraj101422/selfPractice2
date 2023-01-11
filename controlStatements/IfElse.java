package controlStatements;

public class IfElse {
	int max;
	static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElse ie = new IfElse();
        int a = 10;
        int b = 20;
        if(a>b) {
        	ie.max = a;
        }
        if(b>a) {
        	ie.max = b;
        }
        System.out.println(ie.max);
        
        name = "Tarun";
        if(name.endsWith("n")) {
        	System.out.println("Code is success");
        } else {
        	System.out.println("Check code");
        }
	}

}
