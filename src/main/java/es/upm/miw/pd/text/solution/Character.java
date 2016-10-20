package es.upm.miw.pd.text.solution;

public class Character extends TextComponent {

	private char value;
	
	public Character(char value) {
		this.value = value;
	}
	
	@Override
	public void add(TextComponent component) {}

	@Override
	public void remove(TextComponent component) {}

	@Override
	public void print() {
		System.out.print(value);		
	}

	@Override
	public boolean isCharacter() {
		return true;
	}

	@Override
	public String toString( boolean upperCase) {
		String ret = String.valueOf(value);
		if (upperCase == true) {
			ret = ret.toUpperCase(); 
		}
		return ret;
			
	}
	
	

}
