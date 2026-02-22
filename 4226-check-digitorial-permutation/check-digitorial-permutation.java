class Solution {
    int fact(int n){
        int mul = 1;
        for(int i = 1;i <= n;i++){
            mul *= i;
        }
        return mul;
    }
    public boolean isDigitorialPermutation(int n) {
        int a = n,sum = 0,k;
        char[] nums = String.valueOf(n).toCharArray();
        while(n > 0){
            k = n % 10;
            sum += fact(k);
            n /= 10;
        }
        char[] res = String.valueOf(sum).toCharArray();
        Arrays.sort(nums);
        Arrays.sort(res);
        return Arrays.equals(nums,res);
    }
}