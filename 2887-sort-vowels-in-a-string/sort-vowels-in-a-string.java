class Solution {
    public String sortVowels(String s) {
        List<Character> lt = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            if(("aeioueAEIOU".contains(String.valueOf(s.charAt(i))))){
                lt.add(s.charAt(i));
            }
        }
        Collections.sort(lt);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 0;i < s.length();i++){
            if(("aeioueAEIOU".contains(String.valueOf(s.charAt(i))))){
                sb.append(lt.get(j++));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}