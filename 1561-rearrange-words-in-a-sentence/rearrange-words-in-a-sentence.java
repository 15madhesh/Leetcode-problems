class Solution {
    public String arrangeWords(String text) {
        String[] words = text.toLowerCase().split(" ");
        int[] len = new int[words.length];
        for(int i = 0;i < len.length;i++){
            len[i] = words[i].length();
        }
        for(int i = 0;i < len.length - 1;i++){
            int k = i;
            for(int j = i + 1;j < len.length;j++){
                if (words[j].length() < words[k].length()) {
                    k = j;
                }
            }
            String word = words[k];
            while (k > i) {
                words[k] = words[k - 1];
                k--;
            }
            words[i] = word;
        }
        String res = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
        for(int i = 1;i < words.length;i++){
            res += " "+words[i];
        }
        return res;
    }
}