/* Collection is a API or Java Collection Framework is a set of classes and interfaces that is in java.util package and provides ready-to-use dsa
* and to manipulate them.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i< 5;i++){
            arraylist.add(sc.nextInt());
        }
        System.out.println(arraylist);
    }

}
