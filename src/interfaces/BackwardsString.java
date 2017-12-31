package interfaces;

public class BackwardsString extends SpecialString{
	
	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public String funkifyText(String s) {
		String string1 = new StringBuilder(s).reverse().toString();
		return string1;
	}
}
