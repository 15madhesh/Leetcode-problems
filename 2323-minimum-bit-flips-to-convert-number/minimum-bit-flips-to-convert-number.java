class Solution {
    public int minBitFlips(int start, int goal) {
        int a = start ^ goal;
        int ct = 0;
        while(a != 0){
            if(a % 2 == 1) ct++;
            a /= 2;
        }
        return ct;
    }
}