package exceptionHandle;

public class UserDefinedException extends RuntimeException{
	
	private int code;
	private String message;

	public UserDefinedException(int code, String message) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.message = message;
		
	}
	
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
      
}
