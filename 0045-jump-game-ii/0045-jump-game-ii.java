class Solution {
    public int jump(int[] nums) {
        int furthur =0;
        int count =0;
        int cup=0;
        for(int i=0;i<nums.length-1;i++){
            furthur=Math.max(furthur,i+nums[i]);
            if(i==cup){
                count++;
                cup=furthur;
            }
        }  
        return count;  
    }
}