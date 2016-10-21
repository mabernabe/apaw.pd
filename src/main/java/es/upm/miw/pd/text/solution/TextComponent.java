package es.upm.miw.pd.text.solution;

public abstract class TextComponent {
	
	
	public abstract void add(TextComponent component);
	
	public abstract void remove(TextComponent component);
	
	protected abstract boolean isCharacter();
	
	public abstract void print();
	
	public abstract String toString(boolean UpperCase);
	

}
