package exceptions;

@SuppressWarnings("serial")
public class CadastroExcpetion extends Exception {
	
	String desc;
	
	public CadastroExcpetion (String desc) {
		this.desc = desc;
	}

}
