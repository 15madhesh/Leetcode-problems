class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int ct = 1;
        for(int i = 0;i < seq.length();i++){
            if(seq.charAt(i) == '('){
                res[i] = 1 - ct;
            } else {
                res[i] = ct;
            }
            ct ^= 1;
        }
        return res;
    }
}