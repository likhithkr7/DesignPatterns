package Singleton.ThreadSafe;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    // other useful instance variables here

    private ChocolateBoiler() {}

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
