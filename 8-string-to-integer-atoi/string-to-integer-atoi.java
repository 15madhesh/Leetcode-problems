class Solution {
    public int myAtoi(String s) {
        int i = 0,j = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i == s.length()) return 0;
        int sign = 1,fg = 0;
        if(s.charAt(i) == '-'){
            sign *= -1;
            i++;
            fg = 1;
        }else if(s.charAt(i) == '+'){ i++; }
        
        while(i < s.length() && s.charAt(i) - '0' == 0){
            i++;
        }
        long val = 0;
        for(int k = i;k < s.length();k++){
            int t = s.charAt(k) - '0';
            if(t >= 0 && t <= 9){
                val = val * 10 + t;
                if (sign == 1 && val > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sign == -1 && val * -1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }else{
                break;
            }
        }
        return (int) val * sign;
    }
}