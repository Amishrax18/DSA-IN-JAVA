class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;

            }
            else{
                j++;
            }
        }
        //Agr i bilkul end pe phuch gaya hoga tabhi wo subsequence present hoga string 2 me

        return (i==s.length());
    }
}