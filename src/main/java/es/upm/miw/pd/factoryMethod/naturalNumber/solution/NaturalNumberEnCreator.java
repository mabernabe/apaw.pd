package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberEnCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEn(1);
	}

}
