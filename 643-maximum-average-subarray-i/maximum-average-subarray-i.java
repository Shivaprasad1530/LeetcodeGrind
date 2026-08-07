class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int l=0,r=k-1;
        for(int i=l;i<=r;i++){
            sum += nums[i];
        }
        double maxSum = sum/k;
        
        while(r<nums.length-1){
            r++;
            sum -= nums[l];
            sum += nums[r];
            l++;
            maxSum = Math.max(maxSum,(sum/k));
        }
        return maxSum;
    }
}