package es.upm.miw.pd.calculator.solution;

import javax.swing.JOptionPane;

public class SubtractCommand implements Command{
	
	Calculator calc;
	
	public SubtractCommand(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void execute() {
        String value= JOptionPane.showInputDialog("Please input value to subtract");
		calc.subtract(Integer.parseInt(value));
	}

	@Override
	public String name() {
		return "Subtract";
	}

}
