package Singleton.Static;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler() {}

    public static ChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
