/*So what I want to discuss in this section is the use of interfaces
*Everything ending with 'able' are interfaces.
* -> Interface can be used instead of abstract classes
* -> Interface can be used to declare what is needed to be done.
* -> Multiple interfaces can be implemented at once.
* */

/* There are three types of Interfaces
* 1> Normal interface -> Where there is a couple of methods.
* 2> Functional/ SAM(Single Abstract Method) -> Its when an interface has single abstract method. There is a Annotation to specify if the
* created interface is Functional by using @FunctionalInterface. Functional is used to create lambda functions i.e. to create short code
*
*
* 3> Marker -> When an interface does not have any methods or it is blank then it is called marker. It is mostly used during serialization.
* serialization is a process of storing values of object in hard disk or local storage where as deserialization is just opposite.
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
