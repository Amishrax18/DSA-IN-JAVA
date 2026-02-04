import java.util.*;
public class binaryToDecimal{
public static  void binToDec(int n){
    int pow=0;
    int decNum=0;
    while(n>0){
        int ld=n%10;
        decNum=decNum+(ld*(int)Math.pow(2,pow));
        pow++;
        n=n/10;
        }
        System.out.println(decNum);
}
        public static void main(String args[]){
        binToDec(1001);
       }
    }