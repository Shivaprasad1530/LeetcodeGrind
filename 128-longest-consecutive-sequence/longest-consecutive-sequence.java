class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        TreeSet<Integer> set =  new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest =1;
        for(int i : set){
            if(!set.contains(i-1)){
                int count=1, x =i;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}