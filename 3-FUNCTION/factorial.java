public class  factorial {
    static void fact(long n){
        long facto=1;
        for(int i=1;i<=n;i++){
            facto=facto*i;
    }

    System.out.println(facto);
}
    public static void main(String[] args) {
        fact(23);
    }
}
