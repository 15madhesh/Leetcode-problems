class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < words.length;i++){
            int val = 0;
            for(int j = 0;j < words[i].length();j++){
                val += weights[words[i].charAt(j) - 'a'];
            }
            System.out.println(val);
            sb.append((char)('z' -  (val % 26)));
        }
        return sb.toString();
    }
}