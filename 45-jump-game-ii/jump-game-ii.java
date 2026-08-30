class Solution {
    public int jump(int[] arr) {
        int l=0,r=0,jumps=0,n=arr.length;
        while(r<n-1){
            int max =0;
            for(int i=l;i<=r;i++){
                max = Math.max((i+ arr[i]),max);
            }
            l=r+1;
            r=max;
            jumps++;
        }
        return jumps;
    }
}