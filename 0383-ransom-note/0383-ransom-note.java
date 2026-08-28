class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:magazine.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
       for(char c:ransomNote.toCharArray()){
        int count=map.getOrDefault(c,0);
        if(count<=0){
            return false;
        }
        else{
            count--;
            map.put(c,count);
        }
       }
       return true;
        
    }
}