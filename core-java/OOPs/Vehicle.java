package OOPs;

public class Vehicle {
    public int id;
    public String color;
    public String brand;

    public Vehicle(){
        System.out.println("Non-parameterized constructor!");
    }

    public Vehicle(int id, String color, String brand){
        /* called current class constructor */
        //this();
        System.out.println("parameterized constructor!");
        /* this refers current revoking-object */
        this.id=id;
        this.color=color;
        this.brand=brand;
    }

    public void getVehicleInfo(){
        System.out.println("Vehicle Id is " + id  + ", Brand is " + brand+", and color is " +color);
    }

    public void startDriving(){
        System.out.println(this.brand + " is driving!");
    }

    public void stopDriving(){
        System.out.println(this.brand + " is stopped!");
    }
}
