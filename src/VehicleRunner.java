public class VehicleRunner
{
    public static void main(String[] args)
    {
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        Bicycle myBike = new Bicycle("Citi Bike", 2, 10);
        System.out.println(myBike.getName()); // inherited method
        System.out.println(myBike.getWheels()); // inherited method
        System.out.println(myBike.getGearCount()); // method ONLY available on Bicycle objects
        myBike.move(50); // inherited method
        myBike.turn(45); // inherited method
        myBike.brake(0.75); // inherited method
        myBike.ringBell(); // method ONLY available on Bicycle objects

        // PREDICT: will these execute?  will they even compile?  if not, why not?
//     myVehicle.honk();
//     myVehicle.lockDoors();
//     System.out.println(myVehicle.getFabric());

        // PREDICT: which of these statements will cause compiler errors?  why?
//     myVehicle.ringBell();
//     System.out.println(myVehicle.getGearCount());
//     myCar.ringBell();
//     myBike.honk();
//     myBike.lockDoors();
    }
}