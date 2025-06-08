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
                System.out.println("File path: "+file.getAbsolutePath());
                System.out.println("File canRead: "+file.canRead());
                System.out.println("File canWrite: "+file.canWrite());
                System.out.println("File Length: "+file.length());
                System.out.println("File Size: "+file.length()*8+"b");
                System.out.println("File Delete: "+ file.delete());
            }
            else System.out.println("File doesn't exists!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
