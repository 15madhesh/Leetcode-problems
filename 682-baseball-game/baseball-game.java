class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> val = new Stack<>();
        for (String st : operations) {
            if (st.equals("+")) {
                int a = val.pop();
                int b = val.peek();
                val.push(a);
                val.push(a + b);
            } else if (st.equals("D")) {
                val.push(val.peek() * 2);
            }
            else if (st.equals("C")) {
                val.pop();
            } else {
                val.push(Integer.parseInt(st));
            }
        }
        int res = 0;
        for(int v : val){
            res += v;
        }
        return res;
    }
}