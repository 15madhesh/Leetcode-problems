class Solution {
    boolean isprime(int a){
        if(a < 2) return false;
        for(int i = 2;i*i <= a;i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max = 0,l = 0,r = 0;
        for(int i = 0;i < nums.length;i++){
            l = nums[i][i];
            r = nums[i][nums.length - i - 1];
            if(isprime(l)){
                max = Math.max(l,max);
            }
            if(isprime(r)){
                max = Math.max(r,max);
            }
        }
        return max;
    }
}