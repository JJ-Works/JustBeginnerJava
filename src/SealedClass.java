// abstract is used to define a roadmap on what the application is going to be.
// final class doesn't allow extension
// sealed class sits in between it lets us choose which class can inherit it but the inheriting class should have final, sealed or non-sealed keyword in it

sealed class First1 permits Second1,Third1{
    public void perform(){
        System.out.println("First");
    }
}

non-sealed class Second1 extends First1{
    public void perform(){
        System.out.println("Second");
        }
}

non-sealed class Third1 extends First1{

    public void perform(){
        System.out.println("Third");
    }
}
public class SealedClass {
    public static void main(String[] args) {
        var third = new Third1();
        third.perform();
    }

}
