package Observer;

public class StatisticsDisplay implements Observer, Display {
    private float prevTemperature;
    private float prevHumidity;
    private float prevPressure;
    private float temperature = -1;
    private float humidity = -1;
    private float pressure = -1;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        if(prevTemperature == -1){
            System.out.println("Here -1.0 means unknown");
        }
        System.out.println("Previous conditions: " + prevTemperature + "F degrees, " + prevHumidity + "% humidity and " + prevPressure + "Pa pressure");
        System.out.println("Updated conditions: " + temperature + "F degrees, " + humidity + "% humidity and " + pressure + "Pa pressure");
    }

    @Override
    public void update() {
        this.prevTemperature = temperature;
        this.prevHumidity = humidity;
        this.prevPressure = pressure;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void deregister() {
        weatherData.removeObserver(this);
    }
}
