class MyHashMap {

    int[] collection;

    public MyHashMap() {
        this.collection = new int[1000001];
        for(int i=0; i < collection.length; i++) collection[i] = -1;
    }
    
    public void put(int key, int value) {
            collection[key] = value;
    }
    
    public int get(int key) {
        return collection[key];
    }
    
    public void remove(int key) {
        collection[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */