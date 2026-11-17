class Solution {
    public String digitSum(String s, int k) {
        int len = s.length();
        if(len<=k){
            return s;
        }
        String st = findDigitSum(s,k);
        len = st.length();
        while(len>k){
            st = findDigitSum(st, k);
            len = st.length();
        }
       return st;
    }
    public String findDigitSum(String s, int k){
        int len = s.length();
        StringBuilder str = new StringBuilder();
        int i=0,sum=0,count=0;
        while(i<len){
            sum += s.charAt(i) - '0';
            count++;
            if(count==k){
                str.append(String.valueOf(sum));
                sum=0;
                count=0;
            }
            i++;
        }
        if(count!=0){
            str.append(String.valueOf(sum));
        }
        return str.toString();
    }
}