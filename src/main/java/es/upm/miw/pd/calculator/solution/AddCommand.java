package es.upm.miw.pd.calculator.solution;

import javax.swing.JOptionPane;

public class AddCommand implements Command{
	
	Calculator calc;
	
	public AddCommand(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void execute() {
        String value= JOptionPane.showInputDialog("Please input value to add");
		calc.add(Integer.parseInt(value));
	}

	@Override
	public String name() {
		return "Add";
	}

}
