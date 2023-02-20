package BridgePattern;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl{

    public SonyAdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void setChannel(int number) {
        System.out.println("SONY: SET CHANNEL");
    }

    @Override
    public void turnOn() {
        System.out.println("SONY: TURN ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SONY: TURN OFF");
    }
}
