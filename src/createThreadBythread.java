public class createThreadBythread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
    }
}

class Mythread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running by thread class");
    }
}

/*

t1.start() --> JVM asks os to create a new thresd --> thread gets stack and program counter space
 */