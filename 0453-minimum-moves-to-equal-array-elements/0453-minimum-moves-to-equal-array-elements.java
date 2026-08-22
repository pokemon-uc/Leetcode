class Solution {
    public int minMoves(int[] nums) {
        int moves=0;int small=nums[0];
        for(int i=0;i<nums.length;i++){
            small=Math.min(nums[i],small);
        }
        for(int i=0;i<nums.length;i++){
            moves+=nums[i]-small;
        }
        
        return moves;
    }
}