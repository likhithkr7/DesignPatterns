package Singleton.DoubleCheckedLocking;

public class ChocolateBoilerClient {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
    }
}
