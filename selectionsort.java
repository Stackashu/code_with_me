public class selectionsort {
    public static void main(String[] args) {
        int[] a = {234,5,2,115,5455,46463,566,342,565,6,0};
        int temp,min;
        for(int i =0 ; i< a.length;i++){
            min=i;
            for ( int j = i+1;j<a.length;j++){
                if(a[min] >a[j]){
                min=j;}
            }
            temp=a[i];
            a[i] = a[min];
            a[min] = temp;
            
        }
        for( int i : a){
            System.out.println(i);
        }
    }
}
