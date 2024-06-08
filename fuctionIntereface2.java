import java.util.function.Function;

public class fuctionIntereface2 {
    public static void main(String[] args) {
         Function<String,String> F1 = x -> x.toUpperCase();
    Function<String,String> F2 = s ->s.substring(0,3);

    System.out.println(F1.andThen(F2).apply("vipyhrrhf"));
    System.out.println(F1.compose(F2).apply("ashish verma"));

    Function<String,String> idn = Function.identity();
    System.out.println(idn.apply("ashish"));
}
    }

