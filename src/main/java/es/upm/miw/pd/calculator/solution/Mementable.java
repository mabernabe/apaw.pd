package es.upm.miw.pd.calculator.solution;

public interface Mementable<T> {
	void createMemento(String mementoName);

	void restoreMemento(String mementoName);
}
