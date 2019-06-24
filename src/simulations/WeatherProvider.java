package simulations;

import java.util.Random;

public class WeatherProvider {

    private final static WeatherProvider weatherProvider = new WeatherProvider();
    private String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};


    private WeatherProvider()
    {
    }

    public static WeatherProvider getProvider()
    {
        return (weatherProvider);
    }

    public String getCurrentWeather(Coordinates coordinates)
    {
        Random rand = new Random();
        int randIndex = 0;

        randIndex = rand.nextInt(4);
        return (this.weather[randIndex]);
    }

}
