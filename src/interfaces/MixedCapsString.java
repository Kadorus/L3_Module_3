package interfaces;

public class MixedCapsString extends SpecialString{
	
	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public String funkifyText(String s) {
		String string1 = "";
		for(int i = 0; i < s.length(); i++) {
			if(i%2!=0) {
				string1 += s.substring(i).toUpperCase();
			}
			else {
				string1 += s.substring(i);
			}
		}
		return string1;
	}

}
