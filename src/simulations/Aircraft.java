package simulations;

public abstract class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCoordinates;
    private static long idIndex = 0;


    public Aircraft(String name, Coordinates coodinates)
    {
        this.name = name;
        this.coordinates = coordinates;
        id = nextId();
    }

    private long nextId(){

        return (this.idIndex++);
    }

}
