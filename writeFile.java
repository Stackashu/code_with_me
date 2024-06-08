
import java.io.IOException;

import java.io.FileWriter;
import java.io.File;
public class writeFile {
    public static void main(String[] args){
    try {
        FileWriter file = new FileWriter("Ashish.txt");
        file.write("My name is Ashish Verma");
        file.close();
        System.out.println("Succesfully writtien");
    } catch (IOException e) {
        System.out.println("An error occured");
        e.printStackTrace();
    }
    }
    }

