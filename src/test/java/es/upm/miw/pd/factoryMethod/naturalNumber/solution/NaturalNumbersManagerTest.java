package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumbersManagerTest {
	  private NaturalNumbersManager naturalnumbersfactory;

	    @Before
	    public void before() {
	        naturalnumbersfactory = new NaturalNumbersManager();
	    }

	    @Test
	    public void testFactoryGetNaturalNumberEs() {
	    	naturalnumbersfactory.setNaturalNumberCreator(new NaturalNumberEsCreator());
	        naturalnumbersfactory.createNaturalNumber();
	        NaturalNumber naturalnumberes = naturalnumbersfactory.getNaturalNumber();
	        naturalnumberes.setValue(2);
	    	assertEquals("dos", naturalnumberes.getTextValue());
	    }

	    @Test
	    public void testFactoryGetNaturalNumberEn() {
	    	naturalnumbersfactory.setNaturalNumberCreator(new NaturalNumberEnCreator());
	        naturalnumbersfactory.createNaturalNumber();
	        NaturalNumber naturalnumberen = naturalnumbersfactory.getNaturalNumber();
	        naturalnumberen.setValue(2);
	    	assertEquals("two", naturalnumberen.getTextValue());
	    }
	    
	    @Test
	    public void testFactoryGetNaturalNumberFr() {
	    	naturalnumbersfactory.setNaturalNumberCreator(new NaturalNumberFrCreator());
	        naturalnumbersfactory.createNaturalNumber();
	        NaturalNumber naturalnumberfr = naturalnumbersfactory.getNaturalNumber();
	        naturalnumberfr.setValue(2);
	    	assertEquals("deux", naturalnumberfr.getTextValue());
	    }

}
