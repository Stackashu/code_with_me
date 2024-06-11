import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> 100;
        System.out.println(sup.get() + " \n ");

        Predicate<Integer> pre =  x -> x % 2==0;

        Function<String,Integer> fun = s -> s.length();
        
        Consumer<Integer> con = s -> System.out.println(s);

        Supplier<Integer> supi = () -> 100;

        Supplier<String> supl = () -> "Ashish Verma";

       System.out.println(pre.test(8) + " \n");

       System.out.println(fun.apply("Ashish Verma " +" \n "));
   
       System.out.println(supi.get() + " \n ");

       con.accept( 4 );

       System.out.println(pre.test(supi.get()));

       con.accept(fun.apply(supl.get()));
    
    }
}


