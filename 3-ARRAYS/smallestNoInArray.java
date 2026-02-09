import java.util.*;
public class smallestNoInArray{
    public static int smallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
               smallest=numbers[i];
            }
        }
        return smallest;

    }
     public static void main(String args[]){
        int numbers[]={5,2,7,6,10};
        System.out.println("smallest number in array is="+smallest(numbers));

     }
}