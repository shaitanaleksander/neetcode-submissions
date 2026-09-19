class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        while(rowIndex-- > 0){
         List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int i = 1; i < result.size(); i++){
                temp.add(result.get(i-1) + result.get(i));
            }
            temp.add(1);
            result = temp;
        }
        return result;
    }
}