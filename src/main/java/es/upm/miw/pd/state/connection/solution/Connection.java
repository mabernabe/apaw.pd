package es.upm.miw.pd.state.connection.solution;


public class Connection {
	
	private State state;
	
	private StateEnum statecode;
	
	private Link link;
	
	public Connection(Link link) {
		assert link != null;
		this.link = link;
		this.statecode = StateEnum.CLOSED;
		this.state = new Closed();
	}
	
	
	public StateEnum getState() {
		return this.statecode;
	}
	
	public void open() {
		this.state.open(this);
	}
	
	public void close() {
		this.state.close(this);
	}
	
	public void start() {
		this.state.start(this);
	}
	
	public void stop() {
		this.state.stop(this);
	}
	
	public void send(String message) {
		this.state.send(this, message);
	}
	
	public void receive(int response) {
		this.state.receive(this, response);
	}
	
	protected void sendMessageToLink(String message) {
		this.link.send(message);
	}
	
	protected void receiveMessageFromLink(int response) {
		this.link.receive(response);
	}
	
	protected void setState(State newState, StateEnum statecode) {
		state = newState;
		this.statecode = statecode;
	}
	
}
