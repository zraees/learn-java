package OOPs;

public class Bike extends Vehicle {
    private int noOfWheels;

    public Bike(int id, String color, String brand, int noOfWheels){
        super(id, color, brand);
        this.noOfWheels = noOfWheels;
    }

    @Override
    public void getVehicleInfo() {
        System.out.println("Vehicle Id is " + id  + ", Brand is " + brand + ", color is " + color + ", and number of wheels are " + noOfWheels);
    }
}
