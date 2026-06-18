public class primeInRange {
    static boolean isPrimeOrNot(int n){
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
           
    }
    return true;
}

static void printAllPrimes(int num){
    for(int i=2;i<=num;i++){
    boolean isPrime = isPrimeOrNot(i);
    if(isPrime== true){
        System.out.println(i);
    }
}
}
 public static void main(String[] args) {
    printAllPrimes(20);
 }

}