class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '*' && !res.isEmpty()){
                res.deleteCharAt(res.length()-1);
            }
            else if(c =='#'){
                res.append(res);
            }
            else if(c=='%'){
                res.reverse();
            }
            else if(c =='*'){
                continue;
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}