package enumDemo;

public enum ErrorCode {
    ERR4001("4001", "Invalid user name"),
    ERR4002("4002", "Server issue");
	
	//private int code;   we can take int as well
	private String code;
	private String message;
	
	private ErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
    public String getCode() {
    	return code;
    } 
    
    public String getMessage() {
    	return message;
    }
}
