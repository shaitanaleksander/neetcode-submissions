class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> cars = new ArrayList<>();

        for(int i = 0; i< position.length; i++){
            cars.add(new int []{position[i], speed[i]});
        }

        cars.sort((a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < cars.size(); i++){
            
            double time = (double)(target - cars.get(i)[0]) / cars.get(i)[1];
//System.out.println(time);
            if(stack.isEmpty() || time > stack.peek()){
               stack.push(time); 
            }
            
        }
       // System.out.println(stack);
        return stack.size();
    }  // (10 - 0)/4  :3, 3, 4.5, 2.5
}
