public class pattern16{
    public static void main(String[] args) {
        int n=10;
        for(int row=1 ; row<=n; row++){
            if(row==1 || row==2 || row==n){

                for(int col=1 ; col<=row; col++){
                    System.out.print("*");
            }
        }
        else{
            //1 *
             System.out.print("*");
             // row-2 spaces
             for(int col=1 ; col<=row-2 ; col++){
                System.out.print(" ");
             }
             //1 *
             System.out.print("*");

        }
        System.out.println();
    }
}
}