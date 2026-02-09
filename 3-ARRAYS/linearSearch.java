import java.util.*;
public class linearSearch{
    public static int search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
             return i;
            }
            
        }
          return -1;

    }
    public static void main(String args[]){
        int numbers[]={3,5,2,6,7,1,10,11};
        int key=7;
        int index=search(numbers,key);
        if(index==-1){
            System.out.println("number not found");
        }
        else{
            System.out.println("key is found at index="+index);
        }

    }
}