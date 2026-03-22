class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd =  Integer.MAX_VALUE;
        int mineven = Integer.MAX_VALUE;
        boolean odd = false,even = false;
        for(int a : nums1){
            if(a % 2 == 1){
                odd = true;
                minodd = Math.min(minodd , a);
            } else{
                even = true;
                mineven = Math.min(mineven ,a);
            }
        }
        if(!odd || !even) return true;
        return minodd < mineven;
    }
}