package es.upm.miw.pd.state.connection.solution;

public class Closed extends State{

	@Override
	public void open(Connection currentconnection) {
		currentconnection.setState(new Ready(), StateEnum.READY);		
	}

	@Override
	public void close(Connection currentconnection) {}

	@Override
	public void start(Connection currentconnection) {
		throw new UnsupportedOperationException("Forbidden operation... ");	
	}

	@Override
	public void stop(Connection currentconnection) {
		throw new UnsupportedOperationException("Forbidden operation... ");
	}

	@Override
	public void send(Connection currentconnection, String message) {
		throw new UnsupportedOperationException("Forbidden operation... ");
	}

	@Override
	public void receive(Connection currentconnection, int response) {
		throw new UnsupportedOperationException("Forbidden operation... ");
	}


}
