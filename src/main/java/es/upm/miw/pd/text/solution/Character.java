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
	
	

}
