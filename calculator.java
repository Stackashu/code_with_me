import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
    
       System.out.println("1.       addtion "); 
       System.out.println("2.     subtraction"); 
       System.out.println("3.    multiplication"); 
       System.out.println("4.      division"); 
       System.out.println("--------------------------------");
       System.out.println(" Enter a number of your choice : "); 
       int n = scan.nextInt();
       System.out.println(" Enter second number : "); 
       int a = scan.nextInt();
       System.out.println(" Enter first number : "); 
       int b = scan.nextInt();
       
    switch(n){
        case 1 : System.out.println(a + b);
                break;
        case 2 : System.out.println(a - b);
                break;
        case 3 : System.out.println(a * b);
                break;
        case 4 : System.out.println(a / b);
                break;        
    }
       
    }
}
