class Solution {
    public int countSeniors(String[] details) {

        int result  = 0;
        for(String  person: details){
            
           String age = person.substring(11, person.length() - 2);
           System.out.println(age);
           if(Integer.parseInt(age) > 60) result++;
        }

        return result;
    }
}