import java.io.File;

public class infoFile {
    public static void main(String[] args) {
    

    File file = new File("Ashish.txt");
    if(file.exists()){
        System.out.println("File Name:     " + file.getName());
        System.out.println("File path:     " + file.getPath());
        System.out.println("File readble:  " + file.canRead());
        System.out.println("File writable: " + file.canWrite());
        System.out.println("File length:   " + file.length());
    }else{
        System.out.println("File not exist");
    }

    if(file.exists()){
        file.delete();
        System.out.println("File deleted :   "  +  file.getName());
    }else{
             System.out.println("File not exist");
    }
    }}
