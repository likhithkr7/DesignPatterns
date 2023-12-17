package Strategy;

import Strategy.Duck.Duck;
import Strategy.Duck.MallardDuck;
import Strategy.Duck.RubberDuck;
import Strategy.Fly.FlyWithBatteryPower;
import Strategy.Quack.Squeak;

/** Strategy Pattern - Defines a family of algorithms, encapsulates each one, and makes them
 * interchangeable. Strategy lets the algorithm vary independently from clients that use it.
 **/

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();

        Duck modelDuck = new RubberDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyWithBatteryPower());
        modelDuck.setQuackBehaviour(new Squeak());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
