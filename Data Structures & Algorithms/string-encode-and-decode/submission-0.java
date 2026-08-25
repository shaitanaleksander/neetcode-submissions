class Solution {

    public String encode(List<String> strs) {

        StringBuilder builder = new StringBuilder();

        for(String str: strs){
            builder.append(str.length()+"#"+str );
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
       int pointer = 0;


        while(pointer < str.length()){
            String numb = "";

            while(str.charAt(pointer) != '#'){
                numb = numb + str.charAt(pointer++);
            }
            pointer++;

            int len = Integer.parseInt(numb);

            String res = str.substring(pointer, pointer + len);
            result.add(res);
            pointer = pointer + len;
        }

        return result;

    }//2#al4#bobo1#a5#smalk0#10#aaaaaaaaaa
}
