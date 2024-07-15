class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int[] l=new int[n];
        int[] r=new int[n];
        l[0]=nums[0];
        r[n-1]=nums[n-1];
        for(int i=1;i<n;i++) l[i]=Math.min(l[i-1],nums[i]);
        for(int i=n-2;i>=0;i--) r[i]=Math.max(r[i+1],nums[i]);
        int maxprofit=0;
        for(int i=0;i<n;i++) maxprofit=Math.max(maxprofit,r[i]-l[i]);
        return maxprofit;
        
    }
}