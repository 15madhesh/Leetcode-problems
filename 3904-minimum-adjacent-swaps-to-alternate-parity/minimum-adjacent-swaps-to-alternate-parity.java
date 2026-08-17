class Solution {
    public int minSwaps(int[] nums) {
        List<Integer> ex = new ArrayList<>();
        List<Integer> ox = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0) ex.add(i);
            else ox.add(i);
        }
        int ec = ex.size();
        int oc = ox.size();
        if(Math.abs(ec - oc) > 1) return -1;
        int res = Integer.MAX_VALUE;
        if(ec >= oc){
            int sp = 0;
            for(int i = 0;i < ec;i++){
                sp += Math.abs(ex.get(i) - 2 * i);
            }
            res = Math.min(res , sp);
        }
        if(ec <= oc){
            int sp = 0;
            for(int i = 0;i < oc;i++){
                sp += Math.abs(ox.get(i) - 2 * i);
            }
            res = Math.min(res , sp);
        }
        return res;
    }
}