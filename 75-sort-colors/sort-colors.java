class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
       
       
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                m++;l++;
            }
            else if(nums[m] ==2){
                swap(nums,m,h);
                h--;
            }
            else{
                m++;
            }
        }
        System.out.println(Arrays.toString(nums));
        
    }
    static void swap(int[] arr, int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
}