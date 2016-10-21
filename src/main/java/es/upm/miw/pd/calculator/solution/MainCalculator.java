package es.upm.miw.pd.calculator.solution;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        MementableCalculator calculator = new MementableCalculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new RestoreCommand(calculator));
    }

    public void execute() {
     //   String key = (String) IO.getIO().select(this.commandManager.keys());
     //   this.commandManager.execute(key);
    	this.commandManager.execute("Add");
    	this.commandManager.execute("Add");
    	this.commandManager.execute("Print");
    	this.commandManager.execute("Save");
    	this.commandManager.execute("Add");
    	this.commandManager.execute("Print");
    	this.commandManager.execute("Restore");
    	this.commandManager.execute("Print");
    	
    }

    public static void main(String[] args) {
     //   IO.getIO().addView(new MainCalculator());
    	new MainCalculator().execute();
    }
}
