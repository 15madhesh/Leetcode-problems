class Solution {
    public int largestAltitude(int[] gain) {
        int m = gain[0];
        int c = 0;
        int max = 0 < m ? m : 0;
        for(int i = 1;i < gain.length;i++){
            m += gain[i];
            max = max < m ? m : max;
        }
        return max;
    }
}