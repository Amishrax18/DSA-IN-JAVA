
public class countDigits {
    static void noOfDigits(int num){
        int count=0;
        while(num!=0){
            int digit=num%10;
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        noOfDigits(123);
    }
    
}
