class Solution {
    public boolean ispalin(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        int mx = 1;
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + mx; j <= s.length(); j++) {
                if (ispalin(s.substring(i, j)) && j - i > mx) {
                    mx = j - i;
                    res = s.substring(i, j);
                }
            }
        }
        return res;
    }
}