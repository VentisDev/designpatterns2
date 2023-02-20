package BridgePattern;

//Basic remote Control(turnon, turnOff)
//Advanced Remote Control (SetChannel)
//Movie Remote Control ( play, pause, rewind)

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public  void turnOff() {
        device.turnOff();
    }


}
