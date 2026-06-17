

public class palindromeNumber {
      static int reverseOfNumber(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
        public static void main(String[] args) {
            int num=212;
            int reverse=reverseOfNumber(num);
            if(num==reverse){
                System.out.println("number is palindrome");
            }
            else{
                System.out.println("number is not palindrome");
            }
        }
    }