import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





public class staticlambda {
    public static void main(String[] args) {
       
        student s1 = new student(1, "A");
        student s2 = new student(2, "B");
        student s3 = new student(3, "C");
        List<student> li = new ArrayList<student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        Collections.sort(li,(a,b) -> b.id - a.id);
        System.out.println(li);

    }
}

 class student{
   public int id ;
   public String name;

   public student(int id , String name){
    this.id= id;
    this.name= name;
   }

   public String toString(){
    return this.id + "    :      " + this.name;
   }

}