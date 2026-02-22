class Solution {
    public String maximumXor(String s, String t) {
        int cz = 0;
        int co = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) - '0' == 1) {
                co++;
            } else {
                cz++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if(co > 0){
                    sb.append('1');
                    co--;
                }else{
                    sb.append('0');
                    cz--;
                }
            } else {
                if(cz > 0){
                    sb.append('1');
                    cz--;
                } else {
                    sb.append('0');
                    co--;
                }
            }
        }
        return sb.toString();
    }
}