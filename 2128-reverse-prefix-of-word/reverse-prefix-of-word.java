class Solution {
    public String reversePrefix(String word, char ch) {
        String res = "";
        for(int i = 0;i < word.length();i++){
            if(word.charAt(i) == ch){
                int k = i;
                int j = i + 1;
                while(k >= 0){
                    res += word.charAt(k--);
                }
                while(j < word.length()){
                    res += word.charAt(j++);
                }
                return res;
            }
        }
        return word;
    }
}