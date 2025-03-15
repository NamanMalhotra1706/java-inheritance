class Vehicle{
    double maxSpeed;
    String fuelType;

    Vehicle(double maxSpeed, String fuelType){
        System.out.println("Parent Constructor Vehicle");
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Vehicle Type: " + this.getClass().getSimpleName());
        System.out.println("Maximum Speed: " + maxSpeed + "Km/hr");
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
        System.out.println("Calling Car Constructor");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle{
    int power;

    Truck(double maxSpeed, String fuelType, int power){
        super(maxSpeed, fuelType);
        this.power = power;
        System.out.println("Calling Truck Constructor");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Power: " + power +"hp");
    }
}

class Motorcycle extends Vehicle{
    double fuelTankCapacity;

    Motorcycle(double maxSpeed, String fuelType, double fuelTankCapacity ){
        super(maxSpeed, fuelType);
        this.fuelTankCapacity = fuelTankCapacity;
        System.out.println("Calling Motorcycle Constructor");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity +"lts");
    }
}
public class VehicleAndTransportSystem {
    public static void main(String[] args){
        Car venue = new Car(180.0, "Petrol", 5);
        venue.displayInfo();
        System.out.println();

        Truck avtr = new Truck(250, "Diesel" , 200);
        avtr.displayInfo();
        System.out.println();

        Motorcycle cdDelux = new Motorcycle(60.0, "Petrol", 15.5);
        cdDelux.displayInfo();




    }
}
