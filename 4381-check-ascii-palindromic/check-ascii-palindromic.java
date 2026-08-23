class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int a = ch;
            int ct = 0;
            while(ct < 8){
                sb.append(a % 2);
                ct++;
                a /= 2;
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}