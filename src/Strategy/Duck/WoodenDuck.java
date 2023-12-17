package Strategy.Duck;

import Strategy.Fly.FlyNoWay;
import Strategy.Quack.MuteQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }
}
