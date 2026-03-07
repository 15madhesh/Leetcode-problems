class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int i = 0;
            while(i <= word.length()){
                String add = word.substring(0 , i++);
                if(set.contains(add)){
                    sb.append(" ").append(add);
                    break;
                }
                if(i == word.length() + 1) sb.append(" ").append(add);
            }
        }
        return sb.toString().trim();
    }
}