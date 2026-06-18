import java.util.*;
public class largestNoInArray{
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;

    }
     public static void main(String args[]){
        int numbers[]={5,2,7,6,10};
        System.out.println("largest number in array is="+largest(numbers));

     }
}