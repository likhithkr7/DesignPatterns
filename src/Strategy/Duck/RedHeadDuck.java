package Strategy.Duck;

import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real RedHead duck");
    }
}
