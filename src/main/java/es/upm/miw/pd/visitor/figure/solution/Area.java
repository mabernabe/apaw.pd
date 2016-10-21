package es.upm.miw.pd.visitor.figure.solution;

public class Area extends Operation{
	
	private double area;

	public double getArea() {
		return area;
	}
	
	@Override
	public void operateCircle(Circle circle) {
		area = Math.PI * circle.getRadius() * circle.getRadius();
		
	}

	@Override
	public void operateSquare(Square square) {
		area = square.getSide() * square.getSide();
	}

	@Override
	public void operateTriangle(Triangle triangle) {
		area = triangle.getBase() * triangle.getHeight() * 0.5;
	}

	
}
