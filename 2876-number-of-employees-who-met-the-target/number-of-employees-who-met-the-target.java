class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ct = 0;
        for(int a : hours){
            if(a >= target){
                ct++;
            }
        }
        return ct;
    }
}