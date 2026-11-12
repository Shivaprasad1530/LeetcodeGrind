class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int incCount=1,inc=1,decCount =1,dec =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                incCount++;
                decCount=1;
                inc = Math.max(inc,incCount);
            }else if(arr[i] < arr[i-1]){
                decCount++;
                incCount=1;
                dec = Math.max(dec,decCount);
            }
            else{
                incCount=1;
                decCount=1;
            }
        }
        return Math.max(inc,dec);
    }
}