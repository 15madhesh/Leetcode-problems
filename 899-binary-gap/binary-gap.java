class Solution {
    public int binaryGap(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n % 2);
            n /= 2;
        }
        String s = sb.reverse().toString();
        int j = 0,mx = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '1'){
                mx = Math.max(i - j,mx);
                j = i;
            }
        }
        return mx;
    }
}