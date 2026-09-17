class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
       int first =0,second=0,max =0;
       for(int i=0;i<n-1;i++){
        max = Math.max(first+nums[i],second);
        first = second;
        second = max;
       }
       int max1 = max;
       first = 0;
       second =0;
       max=0;
       for(int i=1;i<n;i++){
        max = Math.max(first+nums[i],second);
        first = second;
        second = max;
       }
       int max2 = max;

       return Math.max(max1,max2);
    }
}