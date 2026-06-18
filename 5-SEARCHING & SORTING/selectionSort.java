public class selectionSort {
    public static void SelectionSort(int[] arr) {
     int n=arr.length;
     for(int i=0;i<n-1;i++){
        int min=Integer.MAX_VALUE;
        int mindx=-1;
        for(int j=i;j<n;j++){
            if(arr[j]<min){
                min=arr[j];
                mindx=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[mindx];
        arr[mindx]=temp;
        
     }
    }
    public static void main(String args[]){
        int arr[]={2,5,1,4,-3,-2,9};
        SelectionSort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}