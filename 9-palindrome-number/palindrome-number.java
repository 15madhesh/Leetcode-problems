class Solution {
    public boolean isPalindrome(int x) {
        int y = 0,i = 0,z = x;
        while(x > 0){
            y = (y * 10) +  (x % 10);
            x /= 10;
            i++;
        }
        return y == z;
    }
}