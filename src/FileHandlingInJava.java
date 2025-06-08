import java.io.File;
import java.io.IOException;

public class FileHandlingInJava {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\L O Q\\Documents\\texts\\NewFile.txt");
//        try{
//            if(file.createNewFile()){
//                System.out.println("File created Successfully!!");
//            }
//            else{
//                System.out.println("File already Exists!!");
//            }
//        }
//
        try{
            if (file.exists()){
                System.out.println("File Name: "+file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.length());
            }
            else System.out.println("File doesn't exists!");
        }
        catch (IOException e){
            System.out.println("File creation Failed!");
        }
    }
}
