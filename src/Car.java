public class Car extends Vehicle
{
    // instance variables (aka attributes, aka fields)
    private String fabric;

    public Car(String name, int wheels, String fabric)
    {
        super(name, wheels);
        this.fabric = fabric;
    }

    // getter methods for instance variables
    public String getFabric()
    {
        return fabric;
    }

    // public methods (aka behaviors)
    public void honk()
    {
        // write some code here to honk, etc.
        System.out.println("Honk honk! Get outta the way!");
    }

    public void lockDoors()
    {
        // write some code here to lock doors, etc.
        System.out.println("Doors Locked, Car Secure");
    }
}