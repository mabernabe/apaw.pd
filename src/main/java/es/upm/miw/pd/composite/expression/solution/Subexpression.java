package es.upm.miw.pd.composite.expression.solution;

import java.util.List;

public abstract class Subexpression extends Expression{
	
	protected List<Expression> subexpression;
	protected String operatorsign;
	
	
	@Override
	public int numberOfNodes() {
        int res = 0;
        for (Expression subexpression : this.subexpression) {
            res += subexpression.numberOfNodes();
        }
        return res;
	}
	
	@Override
	public String toString() {
		return "(" + this.subexpression.get(0).toString() + operatorsign + this.subexpression.get(1).toString() + ")";
	}

}
