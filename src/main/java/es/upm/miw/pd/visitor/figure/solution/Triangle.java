package es.upm.miw.pd.visitor.figure.solution;

public class Triangle extends Figure {
    private double base;

    private double height;

	public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }
	
    public double getHeight() {
		return height;
	}
    
    public double getBase() {
    	return base;
    }

	@Override
	public void accept(Operation operation) {
		operation.operateTriangle(this);
	}

}
