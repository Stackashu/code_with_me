import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class predicateLambda {
    public static void main(String[] args) {
        Predicate<Integer> pre =  x -> x % 2==0;
        
        System.out.println(pre.test(4) + " \n");



        List<Integer> li =  Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        int sum = li.stream().filter(n -> n % 2 == 0).mapToInt(n  -> n ).sum();
        System.out.println(sum + " \n");

      for(Integer i : li)
        if(pre.test(i)){
                 System.out.println(i + " is Even number \n");
        }
    }
}
