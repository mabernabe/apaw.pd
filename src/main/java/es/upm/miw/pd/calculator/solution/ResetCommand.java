package es.upm.miw.pd.calculator.solution;

public class ResetCommand implements Command{
	
	Calculator calc;
	
	public ResetCommand(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void execute() {
		calc.reset();
	}

	@Override
	public String name() {
		return "Reset";
	}

}
