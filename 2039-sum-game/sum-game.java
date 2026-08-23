class Solution {
    public boolean sumGame(String num) {
        double res = 0.0;
        for(int i = 0;i < num.length() / 2;i++){
            res += num.charAt(i) == '?' ? 4.5 : num.charAt(i) - '0';
        }
        for(int i = num.length() / 2;i < num.length();i++){
            res -= num.charAt(i) == '?' ? 4.5 : num.charAt(i) - '0';
        }
        return res != 0.0;
    }
}