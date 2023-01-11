package enumDemo;

public class UserDefinedException extends RuntimeException{

	
	private String code;
	private String message;
	
	public UserDefinedException() {
		super();
	}
	public UserDefinedException(String code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}
}
