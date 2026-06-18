public class perfectNumber {
    static void isNoPerfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
             if (num % i == 0) {
               sum = sum + i;           
       }
        }
        if(sum == num ){
            System.out.println("provided no is perfect number");
        }
        else{
            System.out.println("provided no is not perfect number");
        }
    }
    public static void main(String[] args) {
        isNoPerfect(6);
    }
}
