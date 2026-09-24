class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], new ArrayList<>());
            }
            hm.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer,List<Integer>> mp : hm.entrySet()) {
            List<Integer> lt = mp.getValue();
            int sz = lt.size();
            if(sz >= 3){
                int curr = 0;
                for(int i = 0;i <= sz - 3;i++){
                    curr = 2 * (lt.get(i + 2) - lt.get(i));
                    min = Math.min(min, curr);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}