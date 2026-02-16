class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        String pl = "";
        int i,n = s.length();
        for(i = 0;i < n;i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                pl += Character.toLowerCase(s.charAt(i));
            }
        }
        int j = pl.length() - 1;
        for(i = 0;i < j + 1/ 2;i++){
            if(pl.charAt(i) != pl.charAt(j--)){ return false;  }
        }
        return true;
    }
}