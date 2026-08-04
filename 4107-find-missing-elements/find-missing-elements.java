class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101,max = 0;
        List<Integer> lt = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            min = (min > nums[i]) ? nums[i] : min;
            max = (max < nums[i]) ? nums[i] : max;
            lt.add(nums[i]);
        }
        List<Integer> rs = new ArrayList<>();
        while(min <= max){
            if(!lt.contains(min)){
                rs.add(min);
            }
            min++;
        }
        return rs;
    }
}