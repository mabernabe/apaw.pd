package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoryCharacter {

	private static FactoryCharacter factorychar = new FactoryCharacter();
	
	private Map<String, Character> factory;
	
	private FactoryCharacter() {
		factory = new HashMap<>();
	}
	
	static public FactoryCharacter getFactoryCharacter() {
		return factorychar;
	}

	public Character get(String key) {
		assert(key != null);
		if (factory.containsKey(key)) {
			return factory.get(key);
		}
		else {
			Character newchar = new Character(key.charAt(0));
			factory.put(key, newchar);
			return newchar;
		}
	}
}
