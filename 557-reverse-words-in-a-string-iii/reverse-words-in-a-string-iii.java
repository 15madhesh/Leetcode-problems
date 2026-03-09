class Solution {
    public String reverseWords(String s) {
        String res ="";
        String[] words = s.split(" ");
        for(String st : words){
            for(int i = st.length() - 1;i >= 0;i--){
                res += st.charAt(i);
            }
            res += " ";
        }
        return res.substring(0 , s.length());
    }
}