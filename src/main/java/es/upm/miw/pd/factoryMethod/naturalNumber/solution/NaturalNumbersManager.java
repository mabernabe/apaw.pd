package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumbersManager {
	
	private NaturalNumber naturalnumber;
	
	private NaturalNumberCreator creator;
	
	public void createNaturalNumber() {
		assert(creator != null);
		this.naturalnumber = creator.createNaturalNumber();
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}
	
	public NaturalNumber getNaturalNumber() {
		return naturalnumber;
	}

}
