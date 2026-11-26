class Solution {
    public boolean canAliceWin(int n) {
        int i = 10;
        while(i>0){
            n = n-i;
            if(n>=0){
                i--;
            }
            else{
                if(i%2==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}