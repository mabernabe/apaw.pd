package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends TextComponent{
	
		private List<TextComponent> characters;
		
		public Paragraph() {
			characters = new ArrayList<TextComponent>();
		}

		@Override
		public void add(TextComponent component) {
			if (component.isCharacter() == false) {
				throw new UnsupportedOperationException("Forbidden operation... ");
			}
			else {
				characters.add(component);
			}
		}

		@Override
		public void remove(TextComponent component) {
			characters.remove(component);		
		}

		@Override
		public void print() {
			for (TextComponent character : characters) {
				character.print();
			}
			
		}

		@Override
		public boolean isCharacter() {
			return false;
		}
}
