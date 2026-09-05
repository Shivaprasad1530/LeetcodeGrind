class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] arr = new int[nums.length];

        arr[0] = nums[0];
        arr[1] = Math.max(nums[0],nums[1]);
        int n = nums.length;
        for(int i=2;i<n;i++){
            arr[i] = Math.max(arr[i-2] + nums[i], arr[i-1]);
        }
        return arr[n-1];
    }
}