package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEs(1);
	}

}
