/**
 * La clase `CarRadio` implementa la interfaz `RadioInterface` y representa un radio para automóvil
 * con funcionalidades como encendido, apagado, ajuste de emisoras, volumen, y almacenamiento de emisoras en botones.
 */
public class CarRadio implements RadioInterface {

   
    /**  Esta variable se utilizará para interactuar con la clase Tablero */
    private Tablero tablero;

    /** Estado de encendido o apagado del radio */
    private boolean encendido;

    /** Volumen actual del radio */
    private int volumen;

    /** Emisora actual para la banda AM */
    private double emisoraAM;

    /** Emisora actual para la banda FM */
    private double emisoraFM;

    /** Arreglo para almacenar emisoras en botones para la banda AM */
    private double[] botonesAM = new double[12];

    /** Arreglo para almacenar emisoras en botones para la banda FM */
    private double[] botonesFM = new double[12];

    /**
     * Constructor que inicializa el radio con valores predeterminados.
     */
    public CarRadio(Tablero tablero) {
        this.encendido = false;
        this.volumen = 0;
        this.emisoraAM = 530; // Valor inicial para AM
        this.emisoraFM = 87.9; // Valor inicial para FM
        this.tablero = tablero;

    }

    /**
     * Obtiene la emisora actual para la banda AM.
     * @return Emisora actual de la banda AM.
     */
    public double getEmisoraAM() {
        return emisoraAM;
    }

    /**
     * Establece la emisora actual para la banda AM.
     * @param emisoraAM Nueva emisora para la banda AM.
     */
    public void setEmisoraAM(double emisoraAM) {
        this.emisoraAM = emisoraAM;
    }

    /**
     * Obtiene la emisora actual para la banda FM.
     * @return Emisora actual de la banda FM.
     */
    public double getEmisoraFM() {
        return emisoraFM;
    }

    /**
     * Establece la emisora actual para la banda FM.
     * @param emisoraFM Nueva emisora para la banda FM.
     */
    public void setEmisoraFM(double emisoraFM) {
        this.emisoraFM = emisoraFM;
    }

    /**
     * Obtiene el estado de encendido del radio.
     * @return `true` si el radio está encendido, `false` si está apagado.
     */
    public boolean getEncendido() {
        return encendido;
    }

    /**
     * Enciende el radio y realiza lógica adicional si es necesario.
     */
    @Override
    public void encender() {
        encendido = true;
        // Lógica adicional si es necesario
    if (emisoraAM >= 530 && emisoraAM <= 1610) {
        tablero.mostrarMensaje("Radio encendido. Emisora actual: AM - " + emisoraAM);
    } else if (emisoraFM >= 87.9 && emisoraFM <= 107.9) {
        tablero.mostrarMensaje("Radio encendido. Emisora actual: FM - " + emisoraFM);
    }
    }

    /**
     * Apaga el radio y realiza lógica adicional si es necesario.
     */
    @Override
    public void apagar() {
        encendido = false;
        // Lógica adicional si es necesario
    }

    /**
     * Obtiene el volumen actual del radio.
     * @return Volumen actual del radio.
     */
    @Override
    public int getVolumen() {
        return volumen;
    }

    /**
     * Establece el volumen del radio, si está encendido, y realiza lógica adicional si es necesario.
     * @param volumen Nuevo nivel de volumen.
     */
    @Override
    public void setVolumen(int volumen) {
        if (encendido) {
            this.volumen = volumen;
            // Lógica adicional si es necesario
        }
    }

    /**
     * Cambia la banda de emisoras actual y realiza lógica adicional si es necesario.
     */
    @Override
    public void cambiarBanda() {
        if (encendido) {
            if (emisoraAM <= 1610) {
                emisoraAM += 10;
                tablero.mostrarMensaje("Cambiando de AM a FM. Emisora actual: FM - " + emisoraFM);
            } else {
                emisoraAM = 530;
                tablero.mostrarMensaje("Cambiando de FM a AM. Emisora actual: AM - " + emisoraAM);
            }
            if (emisoraFM <= 107.9) {
                emisoraFM += 0.2;
            } else {
                emisoraFM = 87.9;
            }
            // Lógica adicional si es necesario
        }
    }

    /**
     * Sube la emisora actual y realiza lógica adicional si es necesario.
     */
    @Override
    public void subirEmisora() {
        if (encendido) {
            if (emisoraAM < 1610) {
                emisoraAM += 10;
            } else {
                emisoraAM = 530;
            }
            if (emisoraFM < 107.9) {
                emisoraFM += 0.2;
            } else {
                emisoraFM = 87.9;
            }
            // Lógica adicional si es necesario
        }
    }

    /**
     * Baja la emisora actual y realiza lógica adicional si es necesario.
     */
    @Override
    public void bajarEmisora() {
        if (encendido) {
            if (emisoraAM > 530) {
                emisoraAM -= 10;
            } else {
                emisoraAM = 1610;
            }
            if (emisoraFM > 87.9) {
                emisoraFM -= 0.2;
            } else {
                emisoraFM = 107.9;
            }
            // Lógica adicional si es necesario
        }
    }

    /**
     * Guarda la emisora actual en el botón especificado si el radio está encendido y el número de botón es válido.
     * @param numeroBoton Número del botón (de 1 a 12) donde se guardará la emisora.
     */
    @Override
    public void guardarEmisoraEnBoton(int numeroBoton) {
        if (encendido && numeroBoton >= 1 && numeroBoton <= 12) {
            if (emisoraAM >= 530 && emisoraAM <= 1610) {
                botonesAM[numeroBoton - 1] = emisoraAM;
            } else if (emisoraFM >= 87.9 && emisoraFM <= 107.9) {
                botonesFM[numeroBoton - 1] = emisoraFM;
            }
        }
    }

    /**
     * Selecciona la emisora almacenada en el botón especificado si el radio está encendido y el número de botón es válido.
     * @param numeroBoton Número del botón (de 1 a 12) que contiene la emisora a seleccionar.
     */
    @Override
    public void seleccionarEmisoraEnBoton(int numeroBoton) {
        if (encendido && numeroBoton >= 1 && numeroBoton <= 12) {
            emisoraAM = botonesAM[numeroBoton - 1];
            emisoraFM = botonesFM[numeroBoton - 1];
        }
    }
}
