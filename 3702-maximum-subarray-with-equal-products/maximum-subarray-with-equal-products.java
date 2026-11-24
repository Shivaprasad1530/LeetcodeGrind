class Solution {
    public int maxLength(int[] arr) {
        int primes[] = {2,3,5,7};
        int last[] = {-1,-1,-1,-1};
        int best = 2, left = 0;
        for (int right = 0; right < arr.length; right++) {
            for (int j = 0; j < 4; j++) {
                if(arr[right] %primes[j] == 0){
                    left = Math.max(left,last[j]+1);
                    last[j] = right;
                }
            }
            best = Math.max(best, right -left+1);
        }
        return best;
    }
}