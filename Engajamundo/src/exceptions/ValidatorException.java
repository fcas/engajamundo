package exceptions;

@SuppressWarnings("serial")
public class ValidatorException extends Exception {
	
	String desc;
	
	public ValidatorException (String desc) {
		this.desc = desc;
	}

}
