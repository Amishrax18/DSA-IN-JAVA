

public class sumOfDigits {
    static void sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfDigits(4324);
    }
}
