package simulations;

import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Tower{

    private final CopyOnWriteArrayList<Flyable> observers = new CopyOnWriteArrayList<>();


    public void register(Flyable flyable)
    {
        if (!observers.contains(flyable))
            observers.add(flyable);
        else
            System.out.println("Flyable already exists");
    }

    public void unregister(Flyable flayable)
    {
        if (observers.contains(flayable))
            observers.remove(flayable);
        else
            System.out.println("Flyable does not exist");
    }

    protected void conditionsChanged()
    {
        int i = 0;

        while(i < observers.size())
        {
            observers.get(i).updateConditions();
            i++;
        }
    }
}
