class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(Character ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                st.push(ch);
            }
            if(ch == '*'){
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}