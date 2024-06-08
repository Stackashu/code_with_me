import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        try {
            File file = new File("Ashish.txt");
            if(file.createNewFile()){
                System.out.println("New file created" + file.getName());
            }else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("An error occured ");
            e.printStackTrace();
        }
    }
}
