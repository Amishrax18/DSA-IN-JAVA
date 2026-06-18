import java.util.*;
public class shallowCopyDeepCopy{
    public static void main(String args[]){
        int []arr={10,20,30,40};
        int []x=arr; //shallow copy
        x[0]=19;
        x[1]=111;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        int[]y=Arrays.copyOf(arr,arr.length);   //deep copy
        y[1]=12;
        System.out.println(arr[1]);
        System.out.println(y[1]);
    }
}