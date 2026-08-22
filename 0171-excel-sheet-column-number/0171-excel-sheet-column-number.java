class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(char c:columnTitle.toCharArray()){
           int value= c-'A'+1;
           res=26*res+value;

        }
        
        return res;
    }
}