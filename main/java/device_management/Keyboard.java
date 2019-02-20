package device_management;

import behaviours.IInput;

public class Keyboard extends InputDevice implements IInput {
    private int keys;
    private boolean numberPad;
    private String region;

    public Keyboard(String make, String model, String connectivity, int keys, boolean numberPad, String region) {
        super(make, model, connectivity);
        this.keys = keys;
        this.numberPad = numberPad;
        this.region = region;
    }
    @Override
    public String sendData(String data) {
        return "Typey Typey Typey";
    }
    public int getKeys() {
        return keys;
    }

    public boolean isNumberPad() {
        return numberPad;
    }

    public String getRegion() {
        return region;
    }

}
