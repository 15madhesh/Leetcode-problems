class Solution {
    public int smallestNumber(int n) {
        int p = 0;
        while(Math.pow(2,p) <= n){
            p++;
        }
        return (int)(Math.pow(2,p)) - 1;
    }
}