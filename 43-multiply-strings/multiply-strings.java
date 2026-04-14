class Solution {
    public String multiply(String num1, String num2) {
        if((num1.length() == 1 && num1.charAt(0) == '0') || (num2.length() == 1 && num2.charAt(0) == '0')) return "0";
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length();
        int n2 = num2.length();
        String[] str = new String[n2];
        int i = n2 - 1,l = 0;
        while(i >= 0){
            int k = n2 - 1;
            String st = "";
            while(k > i){
                st += '0'; k--;
            }
            int j = n1 - 1 , v = 0;
            while(j >= 0){
                v += (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                st += (char)((v % 10) + '0');
                v /= 10;
                j--;
            }
            if(v != 0) st += v;
            l = Math.max(l, st.length());
            //System.out.println(st + l);
            str[n2 - 1 - i] = st;
            i--;
        }
        for(i = 0;i < n2;i++){
            int j = str[i].length();
            while(j < l){
                str[i] += '0';
                j++;
            }
            //System.out.println(str[i]);
        }
        int s = 0;
        for(i = 0; i < l;i++){
            for(int j = 0;j < n2;j++){
                s += (str[j].charAt(i) - '0');
            }
            sb.append(s % 10);
            s /= 10;
            //System.out.println(s);
        }
        if(s != 0){
            sb.append(s);
        }
        return sb.reverse().toString();
    }
}