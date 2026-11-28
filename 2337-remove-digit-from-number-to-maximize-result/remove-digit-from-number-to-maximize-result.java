class Solution {
    public String removeDigit(String number, char digit) {
        String max = "";
        int len = number.length();
        for(int i=0;i<len;i++){
            char c = number.charAt(i);
            if(c == digit){
               
                String curr = number.substring(0,i) + number.substring(i+1);
                if(curr.compareTo(max) > 0){
                    max = curr;
                }
            }
        }
        return max;
    }
}