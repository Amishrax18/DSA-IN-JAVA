import java.util.*;
public class pattern5{
    public static void hollow_rectangle(int rows,int columms){
        for (int i=1 ; i<=rows ; i++){
        for (int j=1 ; j<=columms ; j++){
            if(i==1||j==1||i==rows||j==columms){
            System.out.print("*");
        }
        else{
              System.out.print(" ");

        }
        }
        System.out.println();
    }
    }
public static void main(String args[]){
    hollow_rectangle(4,5);
    
}
}
