public class armstrongNumber {
    static void isNoArmstrong(int num ){
        int sum=0;
        int originalNum=num; 
        while(num!=0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(originalNum==sum)
            System.out.println("no is armstrong");
        else{
            System.out.println("no is not armstrong");
        }
}
    public static void main(String[] args) {
        isNoArmstrong(153);
        
    }
}

