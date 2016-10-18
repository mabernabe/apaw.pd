package es.upm.miw.pd.state.connection.solution;

public class Ready extends State{

	@Override
	public void open(Connection currentconnection) {}

	@Override
	public void close(Connection currentconnection) {
		currentconnection.setState(new Closed(), StateEnum.CLOSED);
	}

	@Override
	public void start(Connection currentconnection) {
	}

	@Override
	public void stop(Connection currentconnection) {
		currentconnection.setState(new Stopped(), StateEnum.STOPPED);
	}

	@Override
	public void send(Connection currentconnection, String message) {
		currentconnection.sendMessageToLink(message);
		currentconnection.setState(new Waiting(), StateEnum.WAITING);
	}

	@Override
	public void receive(Connection currentconnection, int response) {
		throw new UnsupportedOperationException("Forbidden operation... ");
	}



}
