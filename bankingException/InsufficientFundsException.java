package bankingException;

public class InsufficientFundsException extends RuntimeException {
	private int code;
	private  String message;
	
	InsufficientFundsException(int code, String message){
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
