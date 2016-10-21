package es.upm.miw.pd.calculator.solution;

import java.util.SortedMap;
import java.util.TreeMap;

public class CalculatorMementoManager<T> {
    private SortedMap<String, T> lista = new TreeMap<String, T>();
 

    public void addMemento(String key, T memento) {
        this.lista.put(key, memento);
    }

    public T getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
}
