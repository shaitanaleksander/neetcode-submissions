class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rez = new ArrayList<>();
        List<Integer> result  = new ArrayList<>();
        result.add(1);

        while(  0 <= numRows - 1) { 
            List<Integer> next = new ArrayList<>();
                
                next.add(1);
                for(int i = 1; i < result.size(); i++){

                    next.add(result.get(i-1) + result.get(i));

                }
                next.add(1);
                rez.add(result);
                result = next;
                numRows--;
        }
       return rez;
    }
}