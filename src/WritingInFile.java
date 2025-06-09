import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args) {
        try{
            FileWriter newFile = new FileWriter("C:\\Users\\L O Q\\Documents\\texts\\writingFile.txt");
            try{
                newFile.write("New File created and written!!");
            }
            finally {
                newFile.close();
            }
            System.out.println("Created successfully!!");
        }
        catch (IOException e){
            try{
                throw new IOException();
            }catch (Exception re) {
                System.out.println("Hello!!");
            }
        }
    }
}
