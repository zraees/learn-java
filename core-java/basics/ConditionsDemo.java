package basics;

public class ConditionsDemo {
    public static void main(String[] args) {

        int age = 6;

        // using if-else ladder
        if (age >= 18){
            System.out.println("You are adult");
        }
        else if (age < 18 && age >= 14) {
            System.out.println("You are teenager");
        }
        else if (age < 14){
            System.out.println("You are child");
        }

        // using switch
        int day =2;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}
