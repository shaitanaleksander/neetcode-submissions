class Solution {
    public boolean isPathCrossing(String path) {
        
        record Pair(int l, int r){}

        Set<Pair> paths = new HashSet();
        int l = 0;
        int r = 0;

        paths.add(new Pair(l,r));

        for(char c: path.toCharArray()) {

                if(c == 'N' || c == 'S'){
                   l += c == 'N' ? 1: -1;
                }
                else r+= c == 'W'? -1 : 1;

            Pair pair = new Pair(l,r);

            if(paths.contains(pair)) return true;
            paths.add(pair);
        }

        return false;
    }
}