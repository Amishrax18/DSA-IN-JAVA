import java.util.*;
public class sortArrayBuiltIn{
    public static void main(String args[]){
        int []arr={10,1,7,4};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
         public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
              System.out.println("");
         }
    }
