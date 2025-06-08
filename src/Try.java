// var can only be used as local variable. you can use it as keyword as well as variable name but cannot be used as class name

public class Try{
public static void main(String[] a){
    System.out.println("Hello");

    // you can use var to make array but don't use square bracket for declaration.
    var array = new int[2];
    var cat = 22;
    var ca = 55;
    var string = "catter";
    System.out.println(cat);

    var object = new ClassName();// This also works.
}}

class ClassName{

}