package es.upm.miw.pd.calculator.solution;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Command> commands = new HashMap<>();

    public void add(Command comand) {
        this.commands.put(comand.name(), comand);
    }

    public void execute(String key) {
        this.commands.get(key).execute();
    }

    public String[] keys() {
        return this.commands.keySet().toArray(new String[0]);
    }
}
