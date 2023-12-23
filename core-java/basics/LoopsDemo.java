package basics;

public class LoopsDemo {
    public static void main(String[] args) {

        // loop = repeats statement multiple times

        // 1 - For loop
        // we know start, termination cond, and jumps (inc/dec)
        System.out.println("FOR-LOOP");
        for (int i=0; i<=10; i=i+2){
            System.out.println("val = " + i);
        }

        // 2 - while loop -- condition-based loop (entry control loop)
        System.out.println("WHILE-LOOP");
        int idx=10;
        while (idx > 0){
            System.out.println("val = " + idx);
            idx-=2;
        }

        // 3 - do while loop (exit control loop)
        System.out.println("DO-WHILE-LOOP");
        do {
            System.out.println("val = " + idx);
            idx+=3;
        } while(idx<=10);

        // 4 - foreach Loop -- enhanced for loop
        System.out.println("FOREACH-LOOP");
        String[] names = {"Zeeshan","Rais"};
        for(String name: names) {
            System.out.println("name " + name);
        }
    }
}
