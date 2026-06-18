public class GCD {
    static int findGcd(int a, int b){
        while(b!=0){
            int temp= b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int ans=findGcd(12, 18);
        System.out.println(ans);
    }
}
