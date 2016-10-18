package es.upm.miw.pd.visitor.figure.solution;

public abstract class Operation {
	
	public abstract void operateCircle(Circle circle);
	
	public abstract void operateSquare(Square square);
	
	public abstract void operateTriangle(Triangle triangle);
}
