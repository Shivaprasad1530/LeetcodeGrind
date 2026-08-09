class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a') lastA = i;
            else if(ch=='b') lastB = i;
            else lastC = i;

            int minIdx = Math.min(lastA, Math.min(lastB, lastC));

            if(minIdx != -1){
                count += minIdx + 1;
            }
        }
        return count;
    }
}