package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public class Text extends TextComponent{

	private List<TextComponent> components;

	public Text() {
		components = new ArrayList<TextComponent>();
	}

	@Override
	public void add(TextComponent component) {
		if (component.isCharacter() == true) {
			throw new UnsupportedOperationException("Forbidden operation... ");
		}
		else {
			components.add(component);
		}
	}

	@Override
	public void remove(TextComponent component) {
		components.remove(component);		
	}

	@Override
	public void print() {
		for (TextComponent component : components) {
			component.print();
		}
	}
	

	@Override
	public String toString(boolean upperCase) {
		String ret = "";
		for (TextComponent component : components) {
			ret+=component.toString(upperCase);
		}
		ret += "---o---\n";
		return ret;
	}	

	@Override
	public boolean isCharacter() {
		return false;
	}

}
