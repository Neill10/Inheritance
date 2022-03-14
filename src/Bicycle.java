public class Bicycle extends Vehicle{
    private int gearCount;

    public Bicycle(String name, int wheels, int gears)
    {
        super(name,wheels);
        gearCount = gears;
    }

    public int getGearCount()
    {
        return gearCount;
    }

    public void ringBell()
    {
        System.out.println("Ding Dong");
    }
}
