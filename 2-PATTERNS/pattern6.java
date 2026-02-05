import java.util.*;
public class pattern6{
    public static void inverted_halfpyramid(int rows){
        for (int i=1 ; i<=rows ; i++){
        for (int j=1 ; j<=rows-i ; j++){
            System.out.print(" ");
        }
        for (int j=1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
        }
      
    }
    
public static void main(String args[]){
  inverted_halfpyramid(4);
    }
}
    
