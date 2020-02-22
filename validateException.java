package userdefinedexception;

public class validateException extends RuntimeException {

	String message;
	
	validateException(){
	
	}
	
	public validateException(String message) {
	
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	}
		


