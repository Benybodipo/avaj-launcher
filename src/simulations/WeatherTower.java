package simulations;

public class WeatherTower extends Tower{


    private final WeatherProvider weatherProvider = WeatherProvider.getProvider();


    public String getWeather(Coordinates coordinates)
    {
        return (weatherProvider.getCurrentWeather(coordinates));
    }

    public void changeWeather()
    {
        super.conditionsChanged();
    }

}
