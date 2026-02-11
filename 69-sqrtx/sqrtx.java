class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        int l = 0,r = x,res = 0;
        while(l <= r){
            long m = l + (r - l) / 2;
            if(m * m == x){
                return (int) m;
            }else if(m * m < x){
                res = (int) m;
                l = (int) m + 1;
            }else{
                r = (int) m - 1;
            }
        }
        return res;
    }
}