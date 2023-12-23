package Observer;

import java.sql.SQLOutput;

/** Observer Pattern - Defines one-to-many dependency between objects so that when one
 *  object changes state, all its dependents are notified and updated automatically.
 **/

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\nMeasurements have changed");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\nMeasurements have changed");
        weatherData.setMeasurements(78, 90,29.2f);

        statisticsDisplay.deregister();

        System.out.println("\nMeasurements have changed");
        weatherData.setMeasurements(83, 88,30.5f);
    }
}
