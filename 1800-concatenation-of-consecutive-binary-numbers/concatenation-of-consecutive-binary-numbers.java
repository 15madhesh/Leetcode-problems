class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int len = 0;
        long mod = (long) Math.pow(10,9) + 7;
        for(int i = 1;i <= n;i++){
            if((i & (i - 1)) == 0){
                len++;
            }
            res = ((res  << len) + i) % mod;
        }
        return (int) res;
    }
}