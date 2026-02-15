class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> tp = new TreeMap<>();
        for(int[] it : items1){
            tp.put(it[0], tp.getOrDefault(it[0] , 0) + it[1]);
        }
        for(int[] it : items2){
            tp.put(it[0], tp.getOrDefault(it[0] , 0) + it[1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp : tp.entrySet()){
            res.add(Arrays.asList(mp.getKey(),mp.getValue()));
        }
        return res;
    }
}