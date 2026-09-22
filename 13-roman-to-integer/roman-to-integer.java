import java.util.*;
class Solution {
    public int romanToInt(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1); 
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L', 50); 
        map.put('C', 100); 
        map.put('D', 500); 
        map.put('M', 1000); 
        int sum = 0;
        int last = s.length();
        for(int i=0;i<last;i++){
            char ch = s.charAt(i);
            if(i!=last-1){
                char n = s.charAt(i+1);
                 if(ch == 'I' && n == 'V'){
                    sum += 4;
                    i++;
                 }
                 else if(ch == 'I' && n == 'X'){
                    sum += 9;
                    i++;
                 }
                 else if(ch == 'X' && n == 'L'){
                    sum += 40;
                    i++;
                 }
                 else if(ch == 'X' && n == 'C'){
                    sum += 90;
                    i++;
                 }
                 else if(ch == 'C' && n == 'D'){
                    sum += 400;
                    i++;
                 }
                 else if(ch == 'C' && n == 'M'){
                    sum += 900;
                    i++;
                 }
                 else{
                    sum += map.get(ch);
                 }
            }
            else{
                sum += map.get(ch);
            }
        }
        return sum;
    }
}