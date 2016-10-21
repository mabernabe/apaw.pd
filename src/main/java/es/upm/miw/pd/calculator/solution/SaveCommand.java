package es.upm.miw.pd.calculator.solution;

import javax.swing.JOptionPane;

public class SaveCommand implements Command{
	
	MementableCalculator calc;
	
	
	public SaveCommand(MementableCalculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void execute() {
		String mementoName= JOptionPane.showInputDialog("Please input a Save name");
		calc.createMemento(mementoName);
	}

	@Override
	public String name() {
		return "Save";
	}

}
