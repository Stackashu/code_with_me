public class mergesort {
    public static void main(String[] args) {
        int[] arr = {3,54,6,37,377,73,8,373};
        int n = arr.length;
    mergesort ms = new mergesort();
    ms.dividearr(arr,0, 7);
}

public void dividearr( int[] arr, int in, int fi){
     int mid = in + (fi - in)/2;
if( in < fi){
    dividearr(arr, in,mid);
    dividearr(arr, mid + 1, fi);
    conquerarr(arr,in,mid,fi);
}
   
}

public void conquerarr(int[] arr, int in , int mid , int fi){
    int[] merged = new int[fi-in +1 ];

int  i = in;
int j = mid +1;
int x= 0; 


while(i<=mid &&  j<=fi){
    if(arr[i] < arr[j]){
        merged[x++] = arr[i++];
    }else{  if(arr[i] > arr[j]){
        merged[x++] = arr[j++];
    }
}}


while(i<=mid){
    if(arr[i] < arr[j]){
        merged[x++] = arr[i++];
    }
}


while (j<=fi) {
    if(arr[i] > arr[j]){
        merged[x++] = arr[j++];
    }
}

for( int a = 0,b =in ; a<merged.length ; a++,b++){
arr[b] = arr[a];
}

for(int w:arr){
    System.out.print(w);
}
}
}


