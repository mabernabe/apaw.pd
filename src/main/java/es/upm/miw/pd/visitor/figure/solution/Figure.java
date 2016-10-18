package es.upm.miw.pd.visitor.figure.solution;

public abstract class Figure {

    public Figure(String description) {
    }
    
    public abstract void accept(Operation operation);
    

}
