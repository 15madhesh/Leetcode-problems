class Solution {
    public int titleToNumber(String c) {
        if(c.length() <= 1){
            return (c.charAt(0) - 64);
        }
        int num = 0,j = 0;
        for(int i = c.length() - 1;i >= 0;i--){
            num += Math.pow(26,j++) * (c.charAt(i) - 64);
        }
        return num;
    }
}