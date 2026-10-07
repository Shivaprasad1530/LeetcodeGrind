class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();

        for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
        }

        ArrayList<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(Map.Entry<String,Integer> entry : map1.entrySet()){
            String cur = entry.getKey();
            if(map2.containsKey(cur)){
                int sum = map2.get(cur) + entry.getValue();
                if(sum<min){
                    result.clear();
                    result.add(cur);
                    min = sum;
                }else if(sum==min){
                    result.add(cur);
                }
            }
        }
        String[] array = result.toArray(new String[0]);
        return array;

    }
}