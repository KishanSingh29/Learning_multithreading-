package MonitorLooks;

public class syncro {
    public static void main(String[] args) {
        Test s = new Test();
        Thread t1 = new Thread(() -> s.show());

        Thread t2 = new Thread(() -> s.show());
        t1.start();
        t2.start();

    }
}

class Test {
    synchronized void show(){
        System.out.println(Thread.currentThread().getName() + " Inside show");

        try{
        Thread.sleep(2000);
        }
        catch(Exception e){}
        System.out.println(Thread.currentThread().getName() + "show finish");
    }
    
    
}