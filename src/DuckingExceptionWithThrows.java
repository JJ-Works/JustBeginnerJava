// so what ducking is, is you yourself is not trying to handle the exception but saying the method that is calling upon the critical method will have to
// handle the exception themselves.

import jdk.jfr.StackTrace;

class AA {
    int a = 1;
    int b = 0;
    public void may() throws ArithmeticException{

        System.out.println(a/b);
    }
}

public class DuckingExceptionWithThrows {
    public static void main(String[] args) {
        AA aa = new AA();
        try{
            aa.may();
        }
        catch (ArithmeticException e){
            System.out.println("Error "+e);
        }
    }
}
