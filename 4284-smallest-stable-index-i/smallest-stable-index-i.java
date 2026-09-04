class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max= Integer.MIN_VALUE,stable = -1,n=nums.length;
        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
            int min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min = Math.min(min,nums[j]);
            }
            if(max-min<=k){
                stable = i;
                break;
            }
        }
        return stable;
    }
}