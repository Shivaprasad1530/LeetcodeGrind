class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> map =  new TreeMap<>();
        for(int i=0;i<hand.length;i++){
            int ele = hand[i];
            if(map.containsKey(ele)){
                map.replace(ele, map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        while(!map.isEmpty()){
            int n = map.firstKey();
            for(int i=n;i<n+groupSize;i++){
                if(map.containsKey(i)){
                    map.replace(i, map.get(i)-1);
                    if(map.get(i)==0){
                        map.remove(i);
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}