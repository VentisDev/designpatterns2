package BridgePattern;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("SONY: TURN ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SONY: TURN OFF");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("SONY: Set Channel" +number);
    }
}
