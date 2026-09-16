class TimeMap {
    
    private Map<String, Map<Integer, String>> voult = new HashMap<>();


    public TimeMap() {

        
    }
    
    public void set(String key, String value, int timestamp) {
        
        voult.computeIfAbsent(key, k -> new TreeMap<Integer,String>());
        voult.get(key).put(timestamp, value);

    }
    
    public String get(String key, int timestamp) {
        
        if(!voult.containsKey(key)) return "";
        Map<Integer,String> stamps = voult.get(key);
        if(stamps.containsKey(timestamp)) return stamps.get(timestamp); // can be simplified in b-search 


        Integer[] keys =  stamps.keySet().toArray(new Integer[0]);
        int resultKey = search(keys,timestamp);
        System.out.println(voult);
        return resultKey == -1? "" : stamps.get(keys[resultKey]);

    }

    private int search(Integer[] arr, int value){
       // if(arr.length == 1) return value > arr[0] ? -1: arr[0];
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){ // 10 - 20 - 30 -> 3

            int middle = (left + right) / 2;

            if(arr[middle] == value) return value;

            if(arr[middle] > value) right = middle - 1;            
            else left = middle + 1;

        }

            return right;
    }
}
