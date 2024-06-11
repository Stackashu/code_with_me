import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class biInterfaces {
    public static void main(String[] args) {
        BiPredicate<String,Integer> bipr = (str,x) ->str.length() == x;
        System.out.println(bipr.test("Ashish",6));


        BiFunction<String,String,Integer> bifu = (Str1,Str2) -> Str1.length()+Str2.length();
        System.out.println(bifu.apply("ashisi", "Verma"));


        BiConsumer<String,String> bicon = (Str1,Str2) ->System.out.println(Str1+ Str2);
        bicon.accept("papa", "Verma");


    }
}
