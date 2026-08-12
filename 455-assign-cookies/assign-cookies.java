class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,j=0;
        int n=g.length,m=s.length,res=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<n && j<m){
            if(s[j]>=g[i]){
                j++;
                res++;
                i++;
            }
            else if(g[i]>s[j]){
                j++;
            }
            
        }
        return res;
    }
}