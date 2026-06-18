public class LCM {
    static int findGcd(int a, int b){
        while(b!=0){
            int temp= b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=12, b=18;
        int gcd=findGcd(a,b);
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}

