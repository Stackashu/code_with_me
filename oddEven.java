import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number  of your choice");
       int n = scan.nextInt(); 
       

       if ( n%2 == 0){
        System.out.println(n + " is a prime number");
       }else {
    System.out.println(n + " is odd number ");
       }
    }
}
