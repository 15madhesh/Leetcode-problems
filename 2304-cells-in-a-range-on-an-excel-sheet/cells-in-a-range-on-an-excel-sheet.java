class Solution {
    public List<String> cellsInRange(String s) {
        int ft = s.charAt(1) - '0';
        int sd = s.charAt(4) - '0';
        List<String> res = new ArrayList<>();
        String lt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i = lt.indexOf(s.charAt(0));
        int j = lt.indexOf(s.charAt(3));
        while(i <= j){
            for(int k = ft;k <= sd;k++){
                res.add(String.valueOf(lt.charAt(i))+String.valueOf(k));
            }
            i++;
        }
        return res;
    }
}