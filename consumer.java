import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
public class consumer {
    public static void main(String[] args) {
        Consumer<String> con = x -> System.out.println(x);
        con.accept("Ashish Verma");



        Consumer<List<Integer>> con1 = li ->  {
            for(Integer i : li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> con2 = li ->  {
            for(Integer i : li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> co = con2.andThen(con1);
        co.accept(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
    }
}
