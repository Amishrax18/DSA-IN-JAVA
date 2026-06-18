import java.util.*;
public class pattern12{
    public static void kings_pattern(int n){
        int counter=n;
        for (int i=1 ; i<=n ; i++){
        for (int j=1 ; j<=n-i+1; j++){
             System.out.print(j);
             }
            for (int j=1 ; j<=i-1; j++){
            System.out.print("*");
            }
            
            
            for (int j=1 ; j<=i-1; j++){
             System.out.print("*");
             }
            for (int j=n-i+1 ; j>=1; j--){
            System.out.print(j);
            
            
            }
            System.out.println();
            }
            
            }
public static void main(String args[]){
    kings_pattern(5);
    }
    }
