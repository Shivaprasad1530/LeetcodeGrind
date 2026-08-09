class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxLength=0,maxCount=0;
        int arr[] = new int[26];
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            maxCount = Math.max(maxCount, arr[s.charAt(r)-'A']);
            while((r-l+1)-maxCount >k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxLength = Math.max(maxLength,(r-l+1));
            r++;
        }
        return maxLength;
    }
}