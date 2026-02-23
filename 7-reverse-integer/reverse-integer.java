class Solution {
    public int reverse(int x) {
        long sign = 1,val = 0;
        if(x < 0){
            sign = -1;
            x *= (-1);
        }
        while(x > 0){
            val = (x % 10) + val * 10;
            x /= 10;
        }
        if(val>=Integer.MAX_VALUE) return 0;
        return (int)(val * sign);
    }
}