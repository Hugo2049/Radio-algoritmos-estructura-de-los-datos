public class CarRadioFactory implements RadioFactory {
    @Override
    public RadioInterface crearRadio() {
        return new CarRadio();
    }
}