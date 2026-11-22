class Solution {
    public List<Integer> majorityElement(int[] nums) {
       LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        int c = nums[i];
        if(map.containsKey(c)){
            map.replace(c,map.get(c)+1);
        }else{
            map.put(c,1);
        }
       }
       int min = n/3;
       ArrayList<Integer> list = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>min){
                list.add(entry.getKey());
            }
       }
       return list;
    }
}