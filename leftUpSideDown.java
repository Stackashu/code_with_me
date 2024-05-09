import java.util.Scanner;

public class leftUpSideDown {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the size");
      int size = scan.nextInt();
      
      for ( int i =0 ; i< size ; i++){
        for (int j = size ; j >i ; j--){
       System.out.print("*" + " ");
    }
    System.out.println(" \n ");
      }

    }}
