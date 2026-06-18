import java.util.*;
public class secondMax{
     public static void main(String args[]){
        int numbers[]={5,2,7,6,10};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
          for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
     }
      for(int i=0;i<numbers.length;i++){
            if(smax<numbers[i]&&numbers[i]!=max){
                smax=numbers[i];
            }
            }
            System.out.println(max);
            System.out.print(smax);
     }
}
