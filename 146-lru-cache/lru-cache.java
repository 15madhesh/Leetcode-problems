class LRUCache {
    int cap = 0;
    LinkedHashMap<Integer,Integer> hp;
    public LRUCache(int capacity) {
        this.cap = capacity;
        hp = new LinkedHashMap<>(cap, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cap;
            }
        };
    }
    
    public int get(int key) {
        return hp.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        hp.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */