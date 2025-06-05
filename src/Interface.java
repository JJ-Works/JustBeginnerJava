/*Lets talk about what an Interface is ok?
* Interface is like a abstract class but we don't need to keep writing abstract and public
* in Interface the methods that is declared are public and abstract by default.
* One main thing to remember about Interface is that we cannot initialize it and It's methods should be compulsorily implemented in the class which
* implements the interface
* we can actually declare variable inside interface but the catch is that by default it will be
* final meaning it will be constant value and also static meaning we can access it from anywhere.
* */

interface Fruit{
    boolean seed = true; // static and final by default
    int number = 4;      // static and final by default

    void color();
    void shape();
}

class Apple{
    void color(char x){
        System.out.println(x);
    }

    void shape(){
        System.out.println("round");
    }
}
public class Interface {
    public static void main(String[] args) {
        Apple obj = new Apple();
        obj.color('l');
        obj.shape();

        System.out.println(Fruit.seed);
        System.out.println(Fruit.number);
    }
}
