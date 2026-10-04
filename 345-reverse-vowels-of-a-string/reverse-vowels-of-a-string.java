class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            if(findVowel(str.charAt(i)) && findVowel(str.charAt(j))){
                char t = s.charAt(i);
                str.setCharAt(i,s.charAt(j));
                str.setCharAt(j,t);
                i++;
                j--;
            }
            else if(findVowel(str.charAt(i)) && !findVowel(str.charAt(j))){
                j--;
            }
            else{
                i++;
            }
        }
        return str.toString();
    }
    public boolean findVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}