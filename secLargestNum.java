public class secLargestNum {
    public static void main(String[] args) {
        int SL,L;
        int[] a = { 4,3,75,535,764,84,0};
        L=0;
        SL =0;

        for(int i=0;i<a.length-1;i++){
               if(a[i] <a[i+1]){
               L = a[i+1];
               SL = a[i];
               }
        }
        System.out.println("max num is this array : " + L);
        System.out.println("max num is this array : " + SL);
    }
}
