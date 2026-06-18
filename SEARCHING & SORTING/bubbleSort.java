import java.util.*;
public class bubbleSort{
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
            }
    }
public static void main(String args[]){
     int arr[]={2,1,5,3,4};
     print(arr);
    System.out.println();
     int n=arr.length;
    // for(int i=0;i<n-1;i++){
    //     for(int j=0;j<n-1;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }
    //     }
    // }
    // print(arr);

    // More optimized bubble sorting
    for(int i=0;i<n-1;i++){
        int swaps=0;
        for(int j=0;j<n-1;j++){
             if(arr[j]>arr[j+1]){
              int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 swaps++;
             }
             }
             if(swaps==0) break;
}
print(arr);
}
}