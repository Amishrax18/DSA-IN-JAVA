import java.util.*;
public class sumOfElementsOfArray{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        sum+=arr[i];
        }
        System.out.print("sum of aaray="+sum);
}
}