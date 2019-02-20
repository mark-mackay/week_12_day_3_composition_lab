import behaviours.IOutput;
import behaviours.IInput;
import device_management.Computer;
import device_management.Monitor;
import device_management.Printer;
import device_management.Speaker;
import device_management.Keyboard;
import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;

    @Before
    public void before() {
        keyboard = new Keyboard("IBM", "FX72", "Wired", 125, true, "UK");
        mouse = new Mouse("Fujitsu", "D1", "Wireless", 3);
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, keyboard, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer, keyboard, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, keyboard, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canInputViaMouse(){
        assertEquals("Clickety Clickety Click Click, mouse goes...Nadja says hello", computer.inputData("Nadja says hello", mouse));
    }

    @Test
    public void canInputViaKeyBoard(){
        assertEquals("Typey Typey Typey, keyboard goes...Mark says hello", computer.inputData("Mark says hello", keyboard));
    }

}
