package es.upm.miw.pd.composite.expression.solution;

public class Number extends Expression{
	
	private int value;
	
	public Number(int value) {
		this.value = value;
	}
	
	@Override
	public int numberOfNodes() {
        return 1;
	}
	
	@Override
	public int result() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
