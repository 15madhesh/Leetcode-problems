class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int len = nums.size();
        int res = len;
        int i = 0;
        int j = (len + 1) / 2;
        while(i < len / 2 && j < len){
            if(nums.get(i) < nums.get(j)) res-= 2;
            i++;
            j++;
        }
        return res;
    }
}