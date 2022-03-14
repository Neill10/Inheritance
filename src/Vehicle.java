public class Vehicle
{
    // instance variables (aka attributes, aka fields)
    private String name;
    private int wheels;

    public Vehicle(String name, int wheels)
    {
        this.name = name;
        this.wheels = wheels;
    }

    // getter methods for instance variables
    public String getName()
    {
        return name;
    }

    public int getWheels()
    {
        return wheels;
    }

    // public methods (aka behaviors)
    public void move(int distance)
    {
        // code to move
        System.out.println("I just moved " + distance + "!");
    }

    public void turn(int degreesToTurn)
    {
        // code to turn
        System.out.println("I just turned " + degreesToTurn + " degrees!");
    }

    public void brake(double brakePercent)
    {
        // code to brake
        System.out.println("I just applied the brakes at " + (brakePercent * 100) + "%!");
    }
}