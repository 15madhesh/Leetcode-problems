class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean fg = true;
        while (fg) {
            fg = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == original) {
                    original *= 2;
                    fg = true;
                    break;
                }
            }
        }
        return original;
    }
}