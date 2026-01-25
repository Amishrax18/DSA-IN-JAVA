
import java.util.*;
public class isNoPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("no is prime");
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println("no is not prime");
                break;
            }
            else{
                System.out.println("no is prime");
                break;
            }
        }
    }
}