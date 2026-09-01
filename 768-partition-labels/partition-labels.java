import java.util.*;
class Solution {
    public List<Integer> partitionLabels(String s) {
       List<Integer> list = new ArrayList<>();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.replace(c, i);
            }
            else{
                map.put(c,i);
            }
        }
        int start=0,end=0;
        for(int i = 0;i<s.length();i++){
            end = Math.max(end,map.get(s.charAt(i)));
            if(i==end){
                list.add(i-start+1);
                start=i+1;
            }
        }
        return list;
    }
}