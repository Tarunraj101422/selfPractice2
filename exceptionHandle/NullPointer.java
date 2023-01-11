package exceptionHandle;

public class NullPointer {
	
	void show() {
		System.out.println("Okay");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointer n = new NullPointer();
		n.show();
		try {
		n = null;
		n.show();
		System.out.println("try block");
		} catch(NullPointerException np) {
			System.out.println("Exception " +np.getMessage());
		}
		
		
		

	}

}
