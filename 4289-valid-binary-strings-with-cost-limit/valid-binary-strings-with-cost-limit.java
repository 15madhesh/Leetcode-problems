class Solution {
    public boolean cons(String t){
        for(int i = 1;i < t.length();i++){
            if(t.charAt(i - 1) == '1' && t.charAt(i) == '1'){
                return true;
            }
        }
        return false;
    }
    public void backtrack(List<String> res , int n,int k,StringBuilder sb){
        if(sb.length() == n){
            String t = sb.toString();
            if(cons(t)) return;
            int cost = 0;
            for(int i = 0;i < t.length();i++){
                if(t.charAt(i) == '1'){
                    cost += i;
                }
            }
            if(cost <= k){
                res.add(t);
            }
            return;
        }
        sb.append("0");
        backtrack(res , n, k, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append("1");
        backtrack(res , n, k, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
    public List<String> generateValidStrings(int n, int k) {
        List<String> res = new ArrayList<>();
        backtrack(res , n , k, new StringBuilder());
        return res;
    }
}