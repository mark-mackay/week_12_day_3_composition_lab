package device_management;

import behaviours.IInput;

public class Mouse extends InputDevice implements IInput {

    private int buttons;



    public Mouse(String make, String model, String connectivity, int buttons) {
        super(make, model, connectivity);
        this.buttons = buttons;
    }

    @Override
    public String sendData(String data) {
        return "Clickety Clickety Click Click, mouse goes..." + data;
    }

    public int getButtons() {
        return buttons;
    }
}
