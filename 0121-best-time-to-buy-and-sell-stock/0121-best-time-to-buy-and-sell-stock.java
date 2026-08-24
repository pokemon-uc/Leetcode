class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int maxProfit = 0;
        int min=Integer.MAX_VALUE;

        for(int price:nums){
            if(price<min){
                min=price;
            }
            else{
                maxProfit=Math.max(maxProfit,price-min);
            }
        }
         return maxProfit;

    }
}
