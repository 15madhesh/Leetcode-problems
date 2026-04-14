class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ct = 0;
        String st = "";
        for(int i = 0;i < nums.length;i++){
            st += String.valueOf(nums[i]);
        }
        for(int j = 0;j < st.length();j++){
            if(st.charAt(j) - '0' == digit){
                ct++;
            }
            //System.out.println(st);
        }
        return ct;
    }
}