package simulations;

public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weaterTower;

    public JetPlane(String name, Coordinates coordinates)
    {
        super(name, coordinates);

    }

    public void updateConditions()
    {

    }

    public void registerTower(WeatherTower weatherTower)
    {

    }

}
