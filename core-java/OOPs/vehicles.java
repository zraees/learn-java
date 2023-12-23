package OOPs;

public class vehicles {
    private int _id;
    private String _color;
    private String _brand;

    public vehicles(){
        System.out.println("Non-parameterized constructor!");
    }

    public vehicles(int id, String color, String brand){
        System.out.println("parameterized constructor!");
        this._id=id;
        this._color=color;
        this._brand=brand;
    }

    public void GetVehicleInfo(){
        System.out.println("Vehicle Id is " +_id  +", Brand is "+_brand+", and color is "+_color);
    }
}
