class Solution {
    public boolean isHappy(int n) {
     int f = next(n),s=n;
     while(f!=1 &&f!=s){
       s = next(s);
       f = next(next(f));
     }   
     return f==1;
}
public int next(int a){
    int total = 0;
    while(a>0){
        int d = a%10;
        a =a/10;
        total += d*d;
    }
    return total;
}
}