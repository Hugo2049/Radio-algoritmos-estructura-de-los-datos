import static org.junit.Assert.*;
import org.junit.Test;

public class CarRadioTest {

    @Test
    public void testEncenderApagar() {
        CarRadio carRadio = new CarRadio();
        assertFalse(carRadio.getEncendido());
        
        carRadio.encender();
        assertTrue(carRadio.getEncendido());
        
        carRadio.apagar();
        assertFalse(carRadio.getEncendido());
    }

    @Test
    public void testSubirBajarEmisora() {
        CarRadio carRadio = new CarRadio();
        carRadio.encender();

        double emisoraAMInicial = carRadio.getEmisoraAM();
        double emisoraFMInicial = carRadio.getEmisoraFM();

        carRadio.subirEmisora();
        assertEquals(emisoraAMInicial + 10, carRadio.getEmisoraAM(), 0.001);
        assertEquals(emisoraFMInicial + 0.2, carRadio.getEmisoraFM(), 0.001);

        carRadio.bajarEmisora();
        assertEquals(emisoraAMInicial, carRadio.getEmisoraAM(), 0.001);
        assertEquals(emisoraFMInicial, carRadio.getEmisoraFM(), 0.001);
    }

    @Test
    public void testSetVolumen() {
        CarRadio carRadio = new CarRadio();
        carRadio.encender();

        carRadio.setVolumen(100);
        assertEquals(100, carRadio.getVolumen());

        carRadio.setVolumen(0); // Asegurándonos de que el volumen no sea negativo
        assertEquals(0, carRadio.getVolumen());
    }
}

