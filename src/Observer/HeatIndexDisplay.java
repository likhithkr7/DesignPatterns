package Observer;

public class HeatIndexDisplay implements Observer, Display {
    float heatIndex = 0.0f;
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float) (16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh));
        return index;
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void deregister() {
        weatherData.removeObserver(this);
    }
}