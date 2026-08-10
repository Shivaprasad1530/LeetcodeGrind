class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return min(nums,goal) - min(nums,goal-1);
    }
    public int min(int[] nums,int goal){
        int sum=0,count=0,r=0,l=0;
        if(goal<0){
            return 0;
        }
        while(r<nums.length){
            sum += nums[r];
            while(sum>goal){
                sum -= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}