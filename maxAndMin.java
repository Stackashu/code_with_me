public class maxAndMin {
    public static void main(String[] args) {
        int max,min;
        int[] a = {2,49,2,3,299,-1,2000};
        max = a[0];
        min= a[0];
        for(int i =0;i<a.length-1;i++){
           
            if(a[i] < a[i+1]){
            max = a[i+1];
            }else{
                max=a[i];
            }
          
        }
       System.out.println("Max number in the given array is : " + max);

    for(int i =0;i<a.length-1;i++){
           
        if(a[i] < a[i+1]){
        max = a[i];
        }else{
            max=a[i+1];
        }
      
    }
    System.out.println("Min numbr in the given aray : "+  min);
    
       
    }
}
