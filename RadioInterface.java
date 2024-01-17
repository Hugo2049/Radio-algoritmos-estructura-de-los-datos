/**
 * La interfaz `RadioInterface` define un contrato para un radio, proporcionando métodos para gestionar su estado y funciones.
 */
public interface RadioInterface {

    /**
     * Enciende el radio.
     */
    void encender();

    /**
     * Apaga el radio.
     */
    void apagar();

    /**
     * Obtiene el nivel de volumen actual del radio.
     *
     * @return Nivel de volumen actual.
     */
    int getVolumen();

    /**
     * Establece el nivel de volumen del radio.
     *
     * @param volumen Nuevo nivel de volumen.
     */
    void setVolumen(int volumen);

    /**
     * Cambia la banda de emisoras del radio.
     */
    void cambiarBanda();

    /**
     * Sube la emisora actual del radio.
     */
    void subirEmisora();

    /**
     * Baja la emisora actual del radio.
     */
    void bajarEmisora();

    /**
     * Guarda la emisora actual en el botón especificado.
     *
     * @param numeroBoton Número del botón (de 1 a 12) donde se guardará la emisora.
     */
    void guardarEmisoraEnBoton(int numeroBoton);

    /**
     * Selecciona la emisora almacenada en el botón especificado.
     *
     * @param numeroBoton Número del botón (de 1 a 12) que contiene la emisora a seleccionar.
     */
    void seleccionarEmisoraEnBoton(int numeroBoton);
}