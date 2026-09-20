class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> mp = new TreeMap<>();
        for(List<String> lt : responses){
            Set<String> set = new TreeSet<>();
            for(String str : lt){
                set.add(str);
            }
            for(String str : set){
                mp.put(str , mp.getOrDefault(str , 0) + 1);
            }
        }
        int max = 0;
        String res = "";
        for(Map.Entry<String,Integer> hm : mp.entrySet()){
            if(max < hm.getValue()){
                res = hm.getKey();
                max = hm.getValue();
            }
        }
        return res;
    }
}
