class Solution {
    public String reversePrefix(String s, int k) {
        if(k <= 1) return s;
        String res = "";
        for(int i = k - 1;i >= 0;i--){
            res += s.charAt(i);
        }
        return res + s.substring(k , s.length());
    }
}