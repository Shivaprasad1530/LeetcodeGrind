class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return stairs(n,arr);
    }
    public int stairs(int n,int[] arr){
        if(n<=2){
            return n;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        return arr[n] = stairs(n-1,arr) + stairs(n-2,arr);
    }
}