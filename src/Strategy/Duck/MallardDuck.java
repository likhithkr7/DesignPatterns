package Strategy.Duck;

import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
