class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String s = "";
        int min = strs[0].length();
        for(int i = 0;i < strs.length - 1;i++){
            int j = 0;
            while(j < strs[i].length() && j < strs[i+1].length()){
                if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                    break;
                }
                j++;
            }
            if(min > j){
                min = j;
            }
            if(min == 0) return "";
        }
        for(int i = 0;i < min;i++){
            s += (strs[0].charAt(i));
        }
        return s;
    }
}