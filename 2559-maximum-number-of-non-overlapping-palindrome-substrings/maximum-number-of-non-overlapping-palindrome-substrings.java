class Solution {
    public boolean ispalin(String s){
        for(int i = 0;i < s.length() / 2;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        if(k == 1) return s.length();
        int st = 0;
        int n = s.length();
        int ed = k - 1;
        int ct = 0;
        while(ed < n){
             if (ed - k + 1 >= st && ispalin(s.substring(ed - k + 1, ed + 1))) {
                ct++;
                st = ed + 1; 
            } 
            else if (ed - k >= st && ispalin(s.substring(ed - k, ed + 1))) {
                ct++;
                st = ed + 1; 
            }
            ed++;
        }
        return ct;
    }
}