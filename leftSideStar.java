import java.util.Scanner;

public class leftSideStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();

      

    for ( int i = 0; i < size ; i++){
        for ( int j = 0 ; j < size ; j++){
            if (  i > j) {
                System.out.print("*" + " ");
        }else {
            System.out.print(" " + " ");
        }
    }
    System.out.println(" \n ");
}
}
}
