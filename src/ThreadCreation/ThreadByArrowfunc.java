package ThreadCreation;
public class ThreadByArrowfunc {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            System.out.println(
                    "current thread is "
                            + Thread.currentThread().getName()
            );

        });

        t1.start();

        t1.run();
    }
}