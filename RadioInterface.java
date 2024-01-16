public interface RadioInterface {
    void encender();
    void apagar();
    int getVolumen();
    void setVolumen(int volumen);
    void cambiarBanda();
    void subirEmisora();
    void bajarEmisora();
    void guardarEmisoraEnBoton(int numeroBoton);
    void seleccionarEmisoraEnBoton(int numeroBoton);
}
