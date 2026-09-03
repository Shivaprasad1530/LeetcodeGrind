class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0,j=1;
      while(j<nums.length){
        if(nums[i] == nums[j]){
            j++;
        }else{
            swap(nums,i+1,j);
            i++;j++;
        }
      }
      return i+1;
    }
    public void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}