package device_management;

import behaviours.IOutput;
import behaviours.IInput;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;
    private IInput keyboard;
    private IInput mouse;
    private String dataStream;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput keyboard, IInput mouse) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }
    public String outputDataStream() {
        return this.outputData(this.dataStream);
    }


    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }

    public IInput getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(IInput keyboard) {
        this.keyboard = keyboard;
    }

    public IInput getMouse() {
        return mouse;
    }

    public void setMouse(IInput mouse) {
        this.mouse = mouse;
    }
    public String inputData(String data, IInput device){
        this.dataStream = device.sendData(data);
        return this.dataStream;
    }

}
