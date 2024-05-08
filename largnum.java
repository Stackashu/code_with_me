import java.util.Scanner;

public class largnum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        System.out.println("Enter third number");
        int c = scan.nextInt();

        if (a>b && a>c){
            System.out.println(" your number " + a + " is greater ");
        }else if(a<b && b>c){
            System.out.println("your number " + b +" is greater  ");
        }else {
            System.out.println("your number " + c + " is greater " );
        }
        
    }
}