import java.util.*;
public class factorialOfNumber {
public static int factorial(int n){
    int fact=1;
    for(int i=1 ; i<=n ; i++){
        fact=fact*i;
    }
    return fact;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int fact=factorial(n);
    System.out.println(fact);
}
}