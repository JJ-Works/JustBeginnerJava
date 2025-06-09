import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("C:\\Users\\L O Q\\Documents\\texts\\writingFile.txt");
            try {
                int i;
                while((i = reader.read())!= -1){
                    System.out.print((char)i);
                }
            }
            finally {
                reader.close();
            }
        }
        catch (IOException e){
            System.out.println("Exception Occurred!!");
        }

    }
}
