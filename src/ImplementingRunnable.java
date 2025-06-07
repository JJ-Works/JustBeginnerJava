class runner implements Runnable{
    public void run(){
    for (int i = 0; i < 100;i++){
        System.out.println("Thread ONE is up");
    }
    }
}

class runner2 implements Runnable{
    public void run(){
    for (int i = 0;i<100;i++)
        System.out.println("Thread TWO");
    }
}

public class ImplementingRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new runner(); // since runner is a class reference we can just use Runnable.
        runner2 obj2 = new runner2();

        // And we have to create Thread to create thread.

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(() -> System.out.println("thread 3 is running."));

//        t1.setPriority(8);
//        t1.start();
//        t2.start();
        t3.start();
    }
}
