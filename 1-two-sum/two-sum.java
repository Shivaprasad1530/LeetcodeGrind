class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<arr.length;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                res[0] = (map.get(rem));
                res[1] = i;
                break;
            }else{
                map.put(arr[i],i);
            }
         }
        return res;
    }
}