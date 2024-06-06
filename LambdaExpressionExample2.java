@FunctionalInterface
interface babu{  
    public void draw();  
}  
  
/**
 * 
 */
 interface mine {
String getname();
    
}
public class LambdaExpressionExample2 {  
    public static void main(String[] args) {  
          
        babu ashu = () ->System.out.println("Ashish verma");
        ashu.draw(); 

        mine naam = () -> " Ashish verma";
        System.out.println(naam.getname());
      
    }  
}  



