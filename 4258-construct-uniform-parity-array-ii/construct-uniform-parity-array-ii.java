class Solution {
    public boolean uniformArray(int[] nums1) {
        int min =  9999;
        boolean odd = false;
        for(int a : nums1){
            if(a % 2 == 1){
                odd = true;
                min = Math.min(min , a);
            }
        }
        if(!odd) return true;
        for(int a : nums1){
            if(a % 2 == 0 && min > a) return false;
        }
        return true;
    }
}