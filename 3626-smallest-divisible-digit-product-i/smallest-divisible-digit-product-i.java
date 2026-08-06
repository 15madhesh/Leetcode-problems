class Solution {
    public int product(int n){
        int pd = 1;
        while(n != 0){
            pd *= (n % 10);
            n /= 10;
        }
        return pd;
    }
    public int smallestNumber(int n, int t) {
        while(product(n) % t != 0){
            n++;
        }
        return n;
    }
}