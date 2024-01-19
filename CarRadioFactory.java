/**
 * La clase `CarRadioFactory` implementa la interfaz `RadioFactory` y se encarga de la creación de instancias de la clase `CarRadio`.
 */
public class CarRadioFactory implements RadioFactory {

    private Tablero tablero; // Agrega un campo para almacenar el objeto Tablero

     // Modifica el constructor para aceptar un objeto Tablero
     public CarRadioFactory(Tablero tablero) {
        this.tablero = tablero;
    }
    /**
     * Crea y devuelve una nueva instancia de la clase `CarRadio`.
     *
     * @return Nueva instancia de la clase `CarRadio`.
     */
    @Override
    public RadioInterface crearRadio() {
        return new CarRadio(tablero);
    }

    
}