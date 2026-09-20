class Solution {
    public int reverseDegree(String s) {

        // int a = 'a' - 'z' -1;
        // return a;
        int n = s.length();
        int sum =0;
       for(int i=0;i<n;i++){
        int c = Math.abs(s.charAt(i) - 'z' - 1);
        sum += c*(i+1);
       }
       return sum;
    }
}