
class First extends Thread{
    public void run(){
        for (int i = 0; i< 1000; i++) System.out.println("Hello");
    }
}

class Second extends Thread{
    public void run(){
        for (int i = 0; i< 1000; i++) System.out.println("Thread TWO");
    }
}

public class Threading {
    public static void main(String[] args) {

        First first = new First();
        Second second = new Second();

        first.start();
        second.start();
    }
}
