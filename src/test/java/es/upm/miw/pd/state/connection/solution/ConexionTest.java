package es.upm.miw.pd.state.connection.solution;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.state.connection.solution.Connection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConexionTest {
    private Connection conexion;

    private LinkMock link;

    @Before
    public void ini() {
        this.link = new LinkMock();
        this.conexion = new Connection(this.link);
    }

    @Test
    public void testEstadoInicial() {
        assertEquals(StateEnum.CLOSED, this.conexion.getState());
    }

    @Test
    public void testCerradoAbrir() {
        this.conexion.open();
        assertEquals(StateEnum.READY, this.conexion.getState());
    }

    @Test
    public void testCerradoCerrar() {
        this.conexion.close();
        assertEquals(StateEnum.CLOSED, this.conexion.getState());
    }

    @Test
    public void testCerradoNoSoportadoParar() {
        try {
            this.conexion.stop();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoIniciar() {
        try {
            this.conexion.start();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoEnviar() {
        try {
            this.conexion.send("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testCerradoNoSoportadoRecibir() {
        try {
            this.conexion.receive(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testPreparadoAbrir() {
        this.conexion.open();
        this.conexion.open();
        assertEquals(StateEnum.READY, this.conexion.getState());
    }

    @Test
    public void testPreparadoCerrar() {
        this.conexion.open();
        this.conexion.close();
        assertEquals(StateEnum.CLOSED, this.conexion.getState());
    }

    @Test
    public void testPreparadoParar() {
        this.conexion.open();
        this.conexion.stop();
        assertEquals(StateEnum.STOPPED, this.conexion.getState());
    }

    @Test
    public void testPreparadoIniciar() {
        this.conexion.open();
        this.conexion.start();
        assertEquals(StateEnum.READY, this.conexion.getState());
    }

    @Test
    public void testPreparadoEnviar() {
        this.conexion.open();
        this.conexion.send("...");
        assertEquals(StateEnum.WAITING, this.conexion.getState());
        assertEquals("...", link.getMessage());
    }

    @Test
    public void testPreparadoNoSoportadoRecibir() {
        this.conexion.open();
        try {
            this.conexion.receive(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoAbrir() {
        this.conexion.open();
        this.conexion.stop();
        try {
            this.conexion.open();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoNoSoportadoCerrar() {
        this.conexion.open();
        this.conexion.stop();
        try {
            this.conexion.close();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoParar() {
        this.conexion.open();
        this.conexion.stop();
        this.conexion.stop();
        assertEquals(StateEnum.STOPPED, this.conexion.getState());
    }

    @Test
    public void testParadoIniciar() {
        this.conexion.open();
        this.conexion.stop();
        this.conexion.start();
        assertEquals(StateEnum.READY, this.conexion.getState());
    }

    @Test
    public void testParadoNoSoportadoEnviar() {
        this.conexion.open();
        this.conexion.stop();
        try {
            this.conexion.send("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoRecibir() {
        this.conexion.open();
        this.conexion.stop();
        try {
            this.conexion.receive(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testEsperandoNoSoportadoAbrir(){
        this.conexion.open();
        this.conexion.send("");
        try {
            this.conexion.open();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoCerrar(){
        this.conexion.open();
        this.conexion.send("");
        try {
            this.conexion.close();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoParar(){
        this.conexion.open();
        this.conexion.send("");
        try {
            this.conexion.stop();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoIniciar(){
        this.conexion.open();
        this.conexion.send("");
        try {
            this.conexion.start();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoEnviar(){
        this.conexion.open();
        this.conexion.send("");
        try {
            this.conexion.send("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoRecibirACK() {
        this.conexion.open();
        this.conexion.send("...");
        this.conexion.receive(Link.ACK);
        assertEquals(StateEnum.READY, this.conexion.getState());
    }

    @Test
    public void testEsperandoRecibirError() {
        this.conexion.open();
        this.conexion.send("...");
        this.conexion.receive(1);
        assertEquals(StateEnum.CLOSED, this.conexion.getState());
    }


}
