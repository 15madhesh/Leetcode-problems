class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ct = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                String t = nums[i] + nums[j];
                if(i != j && target.equals(t)){
                    ct++;
                    System.out.println(t);
                }
            }
        }
        return ct;
    }
}