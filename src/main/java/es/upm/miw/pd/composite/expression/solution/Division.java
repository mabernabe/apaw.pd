package es.upm.miw.pd.composite.expression.solution;

import java.util.ArrayList;

public class Division extends Subexpression{
	
	public Division(Expression operand1, Expression operand2) {
		assert(operand2.result() != 0);
		subexpression = new ArrayList<Expression>();
		subexpression.add(operand1);
		subexpression.add(operand2);
		operatorsign = "/";
	}
	
	@Override
	public int result() {
        return this.subexpression.get(0).result() / this.subexpression.get(1).result();
	}

}

