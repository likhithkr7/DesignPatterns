package Singleton.ThreadSafe;

public class ChocolateBoilerClient {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println(chocolateBoiler.getDescription());
    }
}
