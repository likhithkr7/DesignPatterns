package Strategy;

public class FlyWithBatteryPower implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying with battery power");
    }
}
