class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',-1);
        map.put('b',-1);
        map.put('c',-1);
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.replace(c,i);
            if(map.get('a')>-1 && map.get('b')>-1 && map.get('c')>-1){
                int m = Math.min(map.get('a'),map.get('b'));
                int n = Math.min(m,map.get('c'));
                count += 1 + (n-0);
            }
        }
        return count;
    }
}