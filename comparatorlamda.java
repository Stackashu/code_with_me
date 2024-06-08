import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class comparatorlamda {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(30);
        ls.add(1);
        ls.add(0);
        ls.add(32);
        //you will get the list in increasing order....
        Collections.sort(ls,(a,b) -> a-b);
        System.out.println(ls);
        //you will get the list in decreasing order....
        Collections.sort(ls,(a,b) -> b-a);
        System.out.println(ls);
        
    }
}
