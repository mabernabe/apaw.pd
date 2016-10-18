package es.upm.miw.pd.visitor.figure.solution;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;


public class FiguresManagerTest {
    private FiguresManager figuresmanager = new FiguresManager();

    @Before
    public void ini() {
        figuresmanager.add(new Circle("CircleA", 4));
        figuresmanager.add(new Circle("CircleB", 5));
        figuresmanager.add(new Square("SquareA", 6));
        figuresmanager.add(new Triangle("TriangleA", 3, 3));
        figuresmanager.add(new Square("SquareB", 2));
    }

    @Test
    public void testTotalArea() {
        assertEquals(173, figuresmanager.totalArea(), 1);
    }

    @Test
    public void testTotalNumberOfSides() {
        assertEquals(11, figuresmanager.totalNumberOfSides(), 1);
    }
}
