package basics;

public class typeConv {
    public static void main(String[] args) {
        int intVar = 89;
        double doubleVar = 88.8;

        System.out.println("int val " + intVar + ", double val " + doubleVar);

        // implicit type casting; automatically by JVM -- widening casting
        double doubleVarNew = intVar;
        System.out.println("implicit type casting " + doubleVarNew);

        // explicit type casting (forcefully by developer) -- narrowing casting -- data loss in this conversion
        int intVarNew = (int)doubleVar;
        System.out.println("explicit type cast " + intVarNew);
    }
}
