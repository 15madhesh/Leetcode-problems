class Solution {
    public String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(i % 2 == 0){
                res.append(s.charAt(i));
            }else{
                char a = s.charAt(i - 1);
                int b = s.charAt(i) - '0';
                res.append((char)(a + b));
            }
        }
        return res.toString();
    }
}