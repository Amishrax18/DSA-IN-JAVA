public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1 ; row<=n; row++){
            //spaces-> part 1
            for(int col=1 ; col<=n-row; col++)
                {
                    System.out.print(" ");
                }
                // part 2
                if(row==1 || row==n){
                    for(int col=1 ;col<=2*row-1 ; col++){
                        System.out.print("*");
            
                    }
                }
                else{
                    //1*
                    System.out.print("*");
                    //2r-3 spaces
                    for(int col=1;col<=2*row-3; col++){
                        System.out.print(" ");
                     //1*
                    
                    }
                    System.out.print("*");   
                }
                System.out.println();
            

    }
    
}
}
