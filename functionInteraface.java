import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class functionInteraface{
    public static void main(String[] args) {
        Function<String,Integer> fun = x -> x.length();
        System.out.println(fun.apply("Ashish Verma \n"));
 




        // Another code...........................................
    Function<String,String> F2 = s ->s.substring(0,3);
    Function<List<student>,List<student>>  bache = Li ->{
        List<student> in = new ArrayList<>();
        for(student s : Li){
             if( F2.apply(s.getName()).equalsIgnoreCase("vip")){
                in.add(s);
             }
        }
        return in;
    };

    student s1 = new student(1, "vipayy");
    student s2 = new student(2, "ashisf");
    student s3 = new student(3, "vipul");
    List<student>  out = Arrays.asList(s1,s2,s3);
    List<student> result = bache.apply(out);
                System.out.println(result);


    }
   

 class student {


    int id;
    String name;
    
public student(int id,String name){
    this.id = id ;
    this.name = name;
}

public String getName(){
    return name;
}

public int getid(){
    return id;
}
public void setname(String name){
    this.name = name;
}
public void setid(int id){
    this.id = id;
}


public String toString(){
    return this.id + " :  " + this.name;
}
    
}