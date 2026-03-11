class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0)
            return 1;
        int sum = 0;
        int i = 0;
        while (n > 0) {
            int v = 1 ^ (n % 2);
            sum = sum + (int) (Math.pow(2, i++) * v);
            n /= 2;
        }
        return sum;
    }
}