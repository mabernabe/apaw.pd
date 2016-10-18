package es.upm.miw.pd.composite.expression.solution;

import java.util.ArrayList;

public class Subtraction extends Subexpression{
	
	public Subtraction(Expression operand1, Expression operand2) {
		subexpression = new ArrayList<Expression>();
		subexpression.add(operand1);
		subexpression.add(operand2);
		operatorsign = "-";
	}
	
	@Override
	public int result() {
        return this.subexpression.get(0).result() - this.subexpression.get(1).result();
	}

}

