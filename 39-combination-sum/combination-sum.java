class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        combine(0,candidates,target,list, ans);
        return ans;
    }
    static void combine(int index,int[] arr,int target, ArrayList<Integer> list,List<List<Integer>> ans){
        if(index == arr.length){
            if(target == 0 ){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            combine(index,arr,target-arr[index],list, ans);
            list.removeLast();
        }
        combine(index+1,arr,target,list, ans);
    }
}