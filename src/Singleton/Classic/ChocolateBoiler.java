package Singleton.Classic;

// NOTE: This is not thread safe!

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {}

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
