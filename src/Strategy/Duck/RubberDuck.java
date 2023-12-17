package Strategy.Duck;

import Strategy.Fly.FlyNoWay;
import Strategy.Quack.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
