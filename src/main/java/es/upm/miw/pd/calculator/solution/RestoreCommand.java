package es.upm.miw.pd.calculator.solution;

import javax.swing.JOptionPane;

public class RestoreCommand implements Command {
	
	MementableCalculator calc;
	
	public RestoreCommand(MementableCalculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void execute() {
		String mementoName= JOptionPane.showInputDialog("Please input the Save name to Restore");
		calc.restoreMemento(mementoName);
	}

	@Override
	public String name() {
		return "Restore";
	}

}
