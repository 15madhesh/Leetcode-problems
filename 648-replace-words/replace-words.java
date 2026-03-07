class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        String res = "";
        for(int i = 0;i < words.length;i++){
            for(String dict : dictionary){
                if(dict.length() >= words[i].length()){
                    continue;
                }
                if(words[i].substring(0,dict.length()).equals(dict)){
                    words[i] = dict;
                }
            }
        }
        return String.join(" ",words);
    }
}