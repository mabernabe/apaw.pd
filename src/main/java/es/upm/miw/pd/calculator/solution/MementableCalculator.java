package es.upm.miw.pd.calculator.solution;


public class MementableCalculator extends Calculator implements Mementable<CalculatorMemento> {
	private CalculatorMementoManager<CalculatorMemento> mementomanager;
	
	public MementableCalculator() {
		mementomanager= new CalculatorMementoManager<CalculatorMemento>();
	}

	@Override
	public void createMemento(String mementoName) {
		this.mementomanager.addMemento(mementoName, new CalculatorMemento(this.getTotal()));
	}

	@Override
	public void restoreMemento(String mementoName) {
		CalculatorMemento memento = this.mementomanager.getMemento(mementoName);
		assert(memento!=null);
        this.setTotal(this.mementomanager.getMemento(mementoName).getTotal());
	}
	

}
