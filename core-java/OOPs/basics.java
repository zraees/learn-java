package OOPs;

public class basics {
    public static void main(String[] args) {

        // initialized class with non-parameterized constructor
        vehicles vehcile1 = new vehicles();
        vehcile1.GetVehicleInfo();

        // initialized with parameterized constructor
        vehcile1 = new vehicles(99, "Yellow", "Toyota");
        vehcile1.GetVehicleInfo();

    }
}
