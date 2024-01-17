/**
 * La clase `CarRadioFactory` implementa la interfaz `RadioFactory` y se encarga de la creación de instancias de la clase `CarRadio`.
 */
public class CarRadioFactory implements RadioFactory {

    /**
     * Crea y devuelve una nueva instancia de la clase `CarRadio`.
     *
     * @return Nueva instancia de la clase `CarRadio`.
     */
    @Override
    public RadioInterface crearRadio() {
        return new CarRadio();
    }
}