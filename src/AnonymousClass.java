/*Trying out Inner anonymous class and abstract anonymous class*/


class A{
    public void shout(){
        System.out.println("Hello world!!");
    }
}

abstract class B
{
    public abstract void shouter();
    }

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void shout(){
                System.out.println("Hello Universe!!");
            }
        };
        obj.shout();

        B obj1 = new B() {
            @Override
            public void shouter() {
                System.out.println("this is inside the anonymous abstract class.");
            }
        };

        //If we were to just try to initialize the abstract class it would not work because abstract classes are non-initializable classes but if we use
        //anonymous class we can easily use the abstract class.

    }
}
