class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k == 0){
            return false;
        }
        Set<Integer> hs = new HashSet<>();
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(!hs.add(nums[i])){
                return true;
            }
            if(hs.size() >= k + 1){
                hs.remove(nums[j++]);
            }
        }
        return false;
    }
}