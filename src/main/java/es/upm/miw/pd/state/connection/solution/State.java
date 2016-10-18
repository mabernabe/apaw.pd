package es.upm.miw.pd.state.connection.solution;

public abstract class State {
	
	public abstract void open(Connection currentconnection);
	
	public abstract void close(Connection currentconnection);
	
	public abstract void start(Connection currentconnection);
	
	public abstract void stop(Connection currentconnection);
	
	public abstract void send(Connection currentconnection, String message);
	
	public abstract void receive(Connection currentconnection, int response);

}
