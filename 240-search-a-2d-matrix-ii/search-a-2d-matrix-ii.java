class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrows=matrix.length;
        int totalcols=matrix[0].length;

       int row=0;
       int col=totalcols-1;

       while(row<totalrows && col>=0){
        if(matrix[row][col]== target){
            return true;
        }
        else if(matrix[row][col] > target){
            col--;
        }
        else{
            //matrix[row][col] < target
            row++;
        }
       }
        return false;
        
    }
}