class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum % k == 0 && i > 0) {
                return true;
            }
            if (hm.containsKey(sum % k) && i - hm.get(sum % k) >= 2) {
                return true;
            }
            if(!hm.containsKey(sum % k)){
                hm.put(sum % k, i);
            }
        }
        return false;
    }
}
