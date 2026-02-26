class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101,max = 0;
        boolean[] bl = new boolean[101];
        for(int i = 0;i < nums.length;i++){
            min = (min > nums[i]) ? nums[i] : min;
            max = (max < nums[i]) ? nums[i] : max;
            bl[nums[i]] = true;
        }
        List<Integer> lt = new ArrayList<>();
        while(min <= max){
            if(!bl[min]){
                lt.add(min);
            }
            min++;
        }
        return lt;
    }
}