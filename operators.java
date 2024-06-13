import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class operators {
    public static void main(String[] args) {
        UnaryOperator<String> un = x -> x.substring(0,3);
        System.out.println(un.apply("Ashish"));

        UnaryOperator<Integer> uni = x -> x * x;
        System.out.println(uni.apply(324));


        BinaryOperator<String> bi = (Str1,Str2) -> Str1 + Str2;
    System.out.println(bi.apply("Ashish" , " Verma"));


  

    Predicate<Integer> unaa = s -> s % 2 == 0;
    System.out.println(unaa.test(9));
   }
}
