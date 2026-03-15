class Solution {
    public int[] shortestToChar(String s, char c) {
        int j = 0,i = 0;
        int t = s.length();
        int[] res = new int[s.length()];
        while(i < s.length()){
            if(s.charAt(i) == c){
                while(j <= i){
                    res[j] = Math.min(Math.abs(i - j),Math.abs(t - j));
                    j++;
                }
                t = i;
            }
            i++;
        }
        while(j < s.length()){
            res[j] = Math.abs(t - j);
            j++;
        }
        return res;
    }
}