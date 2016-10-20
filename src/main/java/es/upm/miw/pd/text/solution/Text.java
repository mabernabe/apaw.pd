package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public class Text extends TextComponent{
			
			private List<TextComponent> component;
			
			public void TextComponent() {
				component = new ArrayList<TextComponent>();
			}

			@Override
			public void add(TextComponent component) {
				if (component.isCharacter() == true) {
					throw new UnsupportedOperationException("Forbidden operation... ");
				}
				else {
					component.add(component);
				}
			}

			@Override
			public void remove(TextComponent component) {
				component.remove(component);		
			}

			@Override
			public void print() {
				for (TextComponent component : component) {
					component.print();
				}
				
			}

			@Override
			public boolean isCharacter() {
				return true;
			}

}
