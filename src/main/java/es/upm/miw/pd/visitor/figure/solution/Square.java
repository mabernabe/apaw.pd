package es.upm.miw.pd.visitor.figure.solution;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }
    
    public double getSide() {
    	return side;
    }

	@Override
	public void accept(Operation operation) {
		operation.operateSquare(this);
	}


}
