package simulations;

public abstract class AircraftFactory {

    public Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {

        Flyable newAircraft;
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        String _type = type.toLowerCase();

        switch (_type)
        {
            case "baloon":
                newAircraft = new Baloon(name, coordinates);
                break;
            case "helicopter":
                newAircraft = new Helicopter(name, coordinates);
                break;
            case "jetplane":
                newAircraft = new JetPlane(name, coordinates);
                break;
            default:
                return (null);

        }
        return (newAircraft);

    }

}
