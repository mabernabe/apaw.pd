package es.upm.miw.pd.state.connection.solution;

import es.upm.miw.pd.state.connection.solution.Link;

public final class LinkMock implements Link {
    private String message;

    private int response;

    public String getMessage() {
        return message;
    }

    public int getResponse() {
        return response;
    }

    @Override
    public void send(String message) {
        this.message = message;
    }

    @Override
    public void receive(int response) {
        this.response = response;
    }

}
