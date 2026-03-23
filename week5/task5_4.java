class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int currentmax=0,maxsum=nums[0];
        int currentmin=0,minsum=nums[0];
        for(int num:nums){
            currentmax=Math.max(num,currentmax+num);
            maxsum=Math.max(currentmax,maxsum);
            currentmin=Math.min(num,currentmin+num);
            minsum=Math.min(minsum,currentmin);
            totalsum+=num;
        }
        if(maxsum<0)
        return maxsum;

        return Math.max(maxsum,totalsum-minsum);
    }
}