class Solution {
    public int minChanges(String s) {
        int len = s.length();
        if(len ==2){
            return (s.charAt(0) == s.charAt(1))? 0:1;
        }
       int changes = 0, i=0,j=1;
       while(j<len){
        char a = s.charAt(i), b = s.charAt(j);
        if(a!=b){
            changes++;
        }
        i = i+2;
        j=j+2;
       }        
       return changes;
    }
}