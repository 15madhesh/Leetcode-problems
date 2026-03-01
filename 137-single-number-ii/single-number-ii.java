class Solution {
    public int singleNumber(int[] nums) {
        int one = 0,two = 0;
        for(int i = 0;i < nums.length;i++){
            one ^= nums[i] & ~two;
            two ^= nums[i] & ~one;
            System.out.println(one+"  "+two+"  "+nums[i]);
        }
        return one;
    }
}