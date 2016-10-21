package es.upm.miw.pd.visitor.figure.solution;

public class NumberOfSides extends Operation{

	private double numberofsides;
	
	public double getNumberofsides() {
		return numberofsides;
	}

	@Override
	public void operateCircle(Circle circle) {
		numberofsides = 0;
	}

	@Override
	public void operateSquare(Square square) {
		numberofsides = 4;
		
	}

	@Override
	public void operateTriangle(Triangle triangle) {
		numberofsides = 3;
		
	}

	
}
