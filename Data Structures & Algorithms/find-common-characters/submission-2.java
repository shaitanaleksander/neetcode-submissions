class Solution {
    public List<String> commonChars(String[] words) {

        int[]arr = new int[26];

        List<String> result = new ArrayList<>();

        for(char c: words[0].toCharArray()) arr[c-'a']++;


        for(int i = 1; i < words.length; i++){

            int[] comp = new int[26];


            for(char c: words[i].toCharArray()){
                comp[c-'a']++;
            }

            for(int j =0; j < 26; j++){
                arr[j] = Math.min(arr[j], comp[j]);
            }

        }

        for(int i =0; i < arr.length; i++) {

            if(arr[i] != 0) {

                int rep = arr[i];

                while(rep != 0){

                    result.add(( ((char)(i + 'a'))+""));
                    rep--;
                }
            }

        }
        return result;
    }
}