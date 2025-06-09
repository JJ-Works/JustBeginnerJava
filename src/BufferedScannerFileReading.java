import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedScannerFileReading {
    public static void main(String[] args) {

        try(BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\L O Q\\Documents\\texts\\writingFile.txt"));){
            try{
                String str;
                while((str = b.readLine())!=null){
                    System.out.print(str);
                }
            }
            finally {
                b.close();
            }
        }
        catch (IOException e){
            System.out.println("Exception Handled!!");
        }
    }
}
