class Solution {
    public List<String> generatePossibleNextMoves(String currentState){
            
            List<String> res  = new ArrayList<>();
            char[] game = currentState.toCharArray();

            for(int i = 1; i < game.length; i++) {

                if(game[i] != '-' && game[i - 1] != '-'){
                    game[i] = '-';
                    game[i-1] = '-';
                    res.add(new String(game));
                    game[i] = '+';
                    game[i-1] = '+';
                }

            }


            return res;
        }
}
