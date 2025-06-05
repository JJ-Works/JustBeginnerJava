// Runtime errors are known as exceptions we may not be able to avoid errors we can mitigate or handle the occurred errors.
// Errors are something that can't be handled. Exceptions are events caused by errors that causes disruption in the normal flow during the
// runtime of the code.
/*
* There are mainly two types of exception i.e.:
* 1> Runtime (Unchecked)
*    Unchecked exceptions are not compulsory to be handled like ArrayOutOfBound, NullPointerException, ArithmeticException etc
* 2> CompileTime (Checked)
*    Checked exceptions are the exception which are compulsorily necessary to be handled like IOException, SQLException.
*
* */

import java.util.Random;

public class LearningExceptions {
    public static void main(String[] args) {

        Random rand = new Random();
        int random = rand.nextInt(5) * 3;
        System.out.println(random);

        System.out.println((int)(Math.random()* 4));

        int[] num = new int[4];

        System.out.println(num[2]);
    }
}
