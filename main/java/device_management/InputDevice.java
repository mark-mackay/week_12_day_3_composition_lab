package device_management;

public abstract class InputDevice {
    private String make;
    private String model;



    private String connectivity;

    public InputDevice(String make, String model, String connectivity) {
        this.make = make;
        this.model = model;
        this.connectivity = connectivity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }
}