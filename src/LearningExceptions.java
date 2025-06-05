// Runtime errors are known as exceptions we may not be able to avoid errors we can mitigate or handle the occurred errors.
// Errors are something that can't be handled

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
