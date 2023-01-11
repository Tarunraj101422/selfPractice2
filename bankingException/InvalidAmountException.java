package bankingException;

public class InvalidAmountException extends RuntimeException {
	private int code;
	private String messge;
	
	public InvalidAmountException(int code, String messge) {
		//super();
		this.code = code;
		this.messge = messge;
	}
	public int getCode() {
		return code = 123;
	}
	public String getMessge() {
		return messge = "Invalid amount";
	}
	
	
}
