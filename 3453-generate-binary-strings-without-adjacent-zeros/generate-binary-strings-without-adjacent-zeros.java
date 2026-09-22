class Solution {
    public boolean cons(String t){
        for(int i = 1;i < t.length();i++){
            if(t.charAt(i - 1) == '0' && t.charAt(i) == '0'){
                return true;
            }
        }
        return false;
    }
    public void backtrack(List<String> res , int n,StringBuilder sb){
        if(sb.length() == n){
            String t = sb.toString();
            if(!cons(t)){
                res.add(t);
            }
            return;
        }
        sb.append("0");
        backtrack(res , n, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append("1");
        backtrack(res , n, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res , n , new StringBuilder());
        return res;
    }
}