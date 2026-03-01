class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while(i < j){
            int min = (height[i] < height[j] ? height[i] : height[j]) * (j - i);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
            res = res < min ? min : res;
        }
        return res;
    }
}