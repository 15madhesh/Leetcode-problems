class MapSum {
    HashMap<String, Integer> hm;    
    public MapSum() {
        hm = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        hm.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for(Map.Entry<String, Integer> map : hm.entrySet()) {
            String key = map.getKey();
            int value = map.getValue();
            if(key.startsWith(prefix)){
                sum += value;
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */