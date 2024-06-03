public class insertionsort {
    public static void main(String[] args) {
        int[] a = {3,53,52,45,2,7,865,4};
        int temp,j;
       for(int i = 0 ; i<a.length;i++){
        temp =a[i];
        j=i;
        while(j>0  && a[j-1] >temp ){
            a[j] = a[j-1];
            j-=1;
        }
        a[j] = temp;
       } 
       for( int i: a){
        System.out.print(i + " ");
       }
    }
}
