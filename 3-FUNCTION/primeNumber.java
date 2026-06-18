
public class primeNumber {
    static void isPrimeOrNot(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("number is not prime");
                break;
            }
            else{
                System.out.println("number is not prime");
            }
        }
    }
    public static void main(String[] args) {
        isPrimeOrNot(234);
    }
    
}
