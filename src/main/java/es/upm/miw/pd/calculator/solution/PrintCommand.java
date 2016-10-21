package es.upm.miw.pd.calculator.solution;

public class PrintCommand implements Command{
	
	Calculator calc;
	
	public PrintCommand(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void execute() {
		System.out.println(calc.getTotal());
	}

	@Override
	public String name() {
		return "Print";
	}

}
