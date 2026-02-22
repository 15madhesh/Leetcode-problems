class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        String vow = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        while (i < j) {
            while (i < j && vow.indexOf(ch[i]) == -1) {
                i++;
            }
            while (i < j && vow.indexOf(ch[j]) == -1) {
                j--;
            }
            if (i < j) {
                char t = ch[i];
                ch[i] = ch[j];
                ch[j] = t;
            }
            i++;
            j--;
        }
        return new String(ch);
    }
}
