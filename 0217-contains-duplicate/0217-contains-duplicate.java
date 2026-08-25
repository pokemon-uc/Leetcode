import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> s = new HashSet<>();
       for(int a:nums){
        s.add(a);
       }
       if(nums.length!=s.size()){
        return true;
       }
       
     return false;
    }
}