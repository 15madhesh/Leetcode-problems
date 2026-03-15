class Solution {
    public int gcd(int a,int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] pf = new int[nums.length];
        int mx = 0;
        long res = 0;
        for(int i = 0;i < nums.length;i++){
            mx = nums[i] > mx ? nums[i] : mx;
            pf[i] = gcd(mx,nums[i]);
        }
        Arrays.sort(pf);
        int i = 0,j = nums.length - 1;
        while(i < j){
            res += gcd(pf[i],pf[j]);
            i++;
            j--;
        }
        return res;
    }
}