class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int[] pf = new int[arr.length];
        int[] sf = new int[arr.length];
        Arrays.fill(pf, Integer.MAX_VALUE);
        Arrays.fill(sf, Integer.MAX_VALUE);
        int l = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
            while(sum > target){
                sum -= arr[l++];
            }
            if(sum == target){
                minlen = Math.min(minlen , i - l + 1);
            }
            pf[i] = minlen;
        }
        int r = arr.length - 1;
        minlen = Integer.MAX_VALUE;
        sum = 0;
        for(int i = arr.length - 1;i >= 0;i--){
            sum += arr[i];
            while(sum > target){
                sum -= arr[r--];
            }
            if(sum == target){
                minlen = Math.min(minlen , r - i + 1);
            }
            sf[i] = minlen;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length - 1;i++){
            if(pf[i] != Integer.MAX_VALUE && sf[i + 1] != Integer.MAX_VALUE){
                res = Math.min(res , pf[i] + sf[i + 1]);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}