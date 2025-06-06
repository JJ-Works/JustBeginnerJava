// try with resource is a new feature in Java that automatically closes the resources.
// Try with resource is specially useful as it minimizes the line of code and finally block doesn't have to be used.

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int I = sc.nextInt();
            System.out.println(I + " Is the output.");
        }
    }
}
