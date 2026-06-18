import java.util.*;
public class binomialCoefficient {
   
public static int factorial(int n){
    int fact=1;
    for(int i=1 ; i<=n ; i++){
        fact=fact*i;
    }
    return fact;
}
 public static int binocoeff(int n,int r){
    int factn=factorial(n);
    int factr=factorial(r);
    int factnmr=factorial(n-r);
    int bincoeff=(factn)/(factr*factnmr);
    return bincoeff;
    }
public static void main(String args[]){
    int n=5;
    int r=2;
  
    int bino=binocoeff(n,r);
    System.out.println(bino);

}
}