class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int ct = 0;
        while(a != 0){
            if(a % 2 == 1) ct++;
            a /= 2;
        }
        return ct;
    }
}