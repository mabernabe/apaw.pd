package es.upm.miw.pd.state.connection.solution;

public class Waiting extends State{
	
	@Override
	public void open(Connection currentconnection) {
		throw new UnsupportedOperationException("Forbidden operation... ");		
	}

	@Override
	public void close(Connection currentconnection) {
		throw new UnsupportedOperationException("Forbidden operation... ");	
	}

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
		if (response == Link.ACK) {
			currentconnection.setState(new Ready(), StateEnum.READY);
		}
		else
		if (response > 0) {
			currentconnection.setState(new Closed(), StateEnum.CLOSED);
		}
		else
			assert false : "Should not to be here";
	}

}
