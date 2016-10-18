package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        double result = 0;
        Area area = new Area();
        for (Figure figure : figures) {
            figure.accept(area);
            result += area.getArea();
        }
        return result;
    }

    public double totalNumberOfSides() {
        double result = 0;
        NumberOfSides numberofsides = new NumberOfSides();
        for (Figure figure : figures) {
            figure.accept(numberofsides);
            result += numberofsides.getNumberofsides();
        }
        return result;
    }

}
