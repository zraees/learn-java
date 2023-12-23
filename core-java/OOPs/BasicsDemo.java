package OOPs;

public class BasicsDemo {
    public static void main(String[] args) {

        // initialized class with non-parameterized constructor
        Vehicle vehicle = new Vehicle();
        vehicle.getVehicleInfo();

        // initialized with parameterized constructor
        vehicle = new Vehicle(99, "Yellow", "Toyota");
        vehicle.getVehicleInfo();

        // class has some methods -- behavior
        vehicle.startDriving();

        vehicle.stopDriving();

    }
}
