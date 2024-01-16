public class CarRadio implements RadioInterface {
    private boolean encendido;
    private int volumen;
    private double emisoraAM;
    private double emisoraFM;
    private double[] botonesAM = new double[12];
    private double[] botonesFM = new double[12];

    public CarRadio() {
        this.encendido = false;
        this.volumen = 0;
        this.emisoraAM = 530; // Valor inicial para AM
        this.emisoraFM = 87.9; // Valor inicial para FM
    }

    public double getEmisoraAM() {
        return emisoraAM;
    }

    public void setEmisoraAM(double emisoraAM) {
        this.emisoraAM = emisoraAM;
    }

    public double getEmisoraFM() {
        return emisoraFM;
    }

    public void setEmisoraFM(double emisoraFM) {
        this.emisoraFM = emisoraFM;
    }

    public boolean getEncendido(){
        return encendido;
    }

    @Override
    public void encender() {
        encendido = true;
        // Lógica adicional si es necesario
    }

    @Override
    public void apagar() {
        encendido = false;
        // Lógica adicional si es necesario
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int volumen) {
        if (encendido) {
            this.volumen = volumen;
            // Lógica adicional si es necesario
        }
    }

    @Override
    public void cambiarBanda() {
        if (encendido) {
            if (emisoraAM <= 1610) {
                emisoraAM += 10;
            } else {
                emisoraAM = 530;
            }
            if (emisoraFM <= 107.9) {
                emisoraFM += 0.2;
            } else {
                emisoraFM = 87.9;
            }
            // Lógica adicional si es necesario
        }
    }

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

    @Override
    public void seleccionarEmisoraEnBoton(int numeroBoton) {
        if (encendido && numeroBoton >= 1 && numeroBoton <= 12) {
            emisoraAM = botonesAM[numeroBoton - 1];
            emisoraFM = botonesFM[numeroBoton - 1];
        }
    }
}
