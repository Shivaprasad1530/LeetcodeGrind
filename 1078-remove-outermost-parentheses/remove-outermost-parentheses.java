class Solution {
    public String removeOuterParentheses(String s) {
        int open =0,close =0;
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open++;
                sb.append('(');
            }else{
                close++;
                 sb.append(')');
            }

            if(open == close){
                res.append(sb.substring(1,sb.length()-1));
                sb = new StringBuilder();
            }
        }
        return res.toString();
    }
}