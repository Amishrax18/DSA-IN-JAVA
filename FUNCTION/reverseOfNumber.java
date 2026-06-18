

public class reverseOfNumber {
    static void revOfNum(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
}
public static void main(String[] args) {
    revOfNum(7493);
}
}
