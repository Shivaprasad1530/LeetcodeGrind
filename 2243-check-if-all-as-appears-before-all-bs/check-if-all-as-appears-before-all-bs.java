class Solution {
    public boolean checkString(String s) {
        int a_s =0,b_s=0, len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c =='a' && b_s>0){
                return false;
            }else if(c=='b'){
                b_s++;
            }
            else{
                continue;
            }
        }
        return true;
    }
}