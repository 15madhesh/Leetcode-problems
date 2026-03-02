class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            List<Integer> val = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    val.add(1);
                }else{
                    List<Integer> prev = res.get(i - 1);
                    int l = prev.get(j - 1);
                    int r = prev.get(j);
                    val.add(l+r);
                }
            }
            res.add(val);
        }
        return res;
    }
}