class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0;int end=0;
        int window=Integer.MAX_VALUE;int currentsum=0;
        for(end=0;end<nums.length;end++){
            currentsum+=nums[end];
            while(currentsum>=target){
                window=Math.min(window,end-s+1);
                currentsum-=nums[s];
                s++;
            }
        }  
        return window==Integer.MAX_VALUE?0:window; 
    }
}