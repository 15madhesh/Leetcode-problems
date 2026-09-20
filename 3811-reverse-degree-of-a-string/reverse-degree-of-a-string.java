class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 0;i < s.length();i++){
            int n = s.charAt(i) - 'a';
            res = res + ((26 - n) * (i + 1));
        }
        return res;
    }
}