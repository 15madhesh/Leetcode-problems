class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0;i <= n;i++){
            int k = i,c = 0;
            while(k > 0){
                k = k & (k - 1);
                c++;
            }
            res[i] = c;
        }
        return res;
    }
}