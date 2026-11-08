package ThreadCreation;

public class checkThreadName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        Thread t1 = new Thread(() -> {
            System.out.println("name of my thread is : " + Thread.currentThread().getName());
            System.out.println("id of my thread is " + Thread.currentThread().getId());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("name of my thread is : " + Thread.currentThread().getName());
            System.out.println("id of my thread is " + Thread.currentThread().getId());
        });

        t1.start();
        t2.start();

    }
}
