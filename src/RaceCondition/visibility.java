package RaceCondition;

public class visibility {
    static volatile boolean flag = false; // volatile -> jab bhi koi read karega wo ram se read karega cache se read nahi karega, is solve visibility problem
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            flag = true; // cache -> flag = ture
        });

        Thread t2 = new Thread(() -> { // cache => flag = false
            while(!flag){ // read flag from cache 
                //System.out.println("THread 2 is running.."); // synchronized
                //don noathing 
            }
            System.out.println("Thread 2 finsished");
        });

        t1.start();
        t2.start();

    }
}
