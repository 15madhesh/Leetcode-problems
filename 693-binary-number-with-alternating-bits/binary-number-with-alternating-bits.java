class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder st = new StringBuilder();
        while(n > 0){
            st.append(n % 2);
            n /= 2;
        }
        String s = st.toString();
        for(int i = s.length() - 1;i > 0;i--){
            if(s.charAt(i) == s.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }
}