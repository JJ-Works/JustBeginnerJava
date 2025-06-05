/*So what I want to discuss in this section is the use of interfaces
*
* -> Interface can be used instead of abstract classes
* -> Interface can be used to declare what is needed to be done.
* -> Multiple interfaces can be implemented at once.
* */

interface Computer{
    void show();
    void done();
}

interface Speaker{
    void has();
}

interface Laptop extends Computer,Speaker{
    void screen();

}

class Developer implements Laptop{
    public void screen(){
        System.out.println("has Screen");
    }

    public void show(){
        System.out.println("implented by developer.");
    }

    public void done(){
        System.out.println("Needs speaker");
    }

    public void has(){
        System.out.println("Has guts.");
    }
}

class SecondUser implements Computer, Speaker{

    @Override
    public void has() {
        System.out.println("has");
    }
    public void done(){
        System.out.println("computer");
    }
    public void show(){
        System.out.println("inside computer show");
    }
}

public class MoreAboutInterface {
    public static void main(String[] args) {
        SecondUser se = new SecondUser();
        se.done();

        // And if were to create a reference of a interface and object of class then we can only use the methods of that interface.
        // For example:
        Computer trial = new SecondUser();
        trial.done();
        trial.show();
        // see
    }
}
