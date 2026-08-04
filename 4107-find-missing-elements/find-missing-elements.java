class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i] != 1){
                int x = nums[i]+1;
                while(x<nums[i+1]){
                    arr.add(x);
                    x++;
                }
            }
        }
        return arr;
    }
}