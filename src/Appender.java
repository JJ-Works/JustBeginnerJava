import java.io.FileWriter;
import java.io.IOException;

public class Appender {
    public static void main(String[] args) {
        try{
            try (FileWriter r = new FileWriter("C:\\Users\\L O Q\\Documents\\texts\\writingFile.txt")) {
                r.append("Tyger tyger tyger tyger burning bright in the forest of the night \n hello");
            }

        }
        catch (IOException e){
            System.out.println("Exp5");
        }

    }
}
