/**
 * La interfaz `RadioFactory` define un contrato para las clases que son responsables de crear instancias de objetos que implementan la interfaz `RadioInterface`.
 */
public interface RadioFactory {
    
    /**
     * Crea y devuelve una nueva instancia de la interfaz `RadioInterface`.
     *
     * @return Nueva instancia de la interfaz `RadioInterface`.
     */
    RadioInterface crearRadio();
}