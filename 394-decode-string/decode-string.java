class Solution {
    public String decodeString(String stg) {
        Stack<Integer> st = new Stack<>();
        Stack<String> str = new Stack<>();
        String s = "";
        int n = 0;
        for(char c : stg.toCharArray()){
            if(Character.isDigit(c)){
                n = n * 10 + (c - '0');
            } else if(c == '['){
                st.push(n);
                n = 0;
                str.push(s);
                s = "";
            } else if(c == ']'){
                int i = st.pop();
                String tmp = s;
                s = str.pop();
                while(i > 0){
                    s += tmp;
                    i--;
                }
            } else {
                s += c;
            }
        }
        return s;
    }
}