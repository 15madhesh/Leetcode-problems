class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int key = map.get(ch);
                if(sb.length() - key <= k){
                    continue;
                }
            }
            map.put(ch,sb.length());
            sb.append(ch);
        }
        return sb.toString();
    }
}