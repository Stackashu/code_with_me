import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        try {
            File file  = new File("Ashish.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                String read = scan.nextLine();
                System.out.println(read);
            }
            scan.close();
        } catch (FileNotFoundException e) {
        System.out.println("An error occred");
        e.printStackTrace();
        }
    }
}
