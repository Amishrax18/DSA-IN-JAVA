import java.util.*;

public class sumOfNNaturalNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int counter=0;
        while(counter<=n){
            sum+=counter;
            counter++;
            }
            System.out.println("sum of first n natural numbers is = "+ sum);
    }
}