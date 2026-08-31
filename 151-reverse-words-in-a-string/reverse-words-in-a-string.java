class Solution {
    public String reverseWords(String s) {
        StringBuilder ans= new StringBuilder();
        int i= s.length()-1;
        while(i>=0){
            //remove all trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j=i;
            //find start index of word
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            ans.append(s.substring(j+1,i+1));
            //remove faltu ke spaces now

            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            if(j>=0){
                ans.append(' ');
            }
            //place I at last index of remaining string
            i=j;
        }
        return ans.toString();
    }
}