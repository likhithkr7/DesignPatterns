package Decorator;

/** Decorator Pattern - Attach additional responsibilities to an object dynamically.
 *  Decorators provide a flexible alternative to subclassing for extending functionality.
**/

public class StarBuzz {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " costs " + beverage.cost());

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);

        System.out.println(espresso.getDescription() + " costs " + espresso.cost());
    }
}
