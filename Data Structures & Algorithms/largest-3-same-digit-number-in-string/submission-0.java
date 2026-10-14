class Solution {
    public String largestGoodInteger(String num) {

        String result = "";


        for(int i = 2; i < num.length(); i++){

            if(num.charAt(i) == num.charAt(i-1)&& num.charAt(i) == num.charAt(i-2)){
                if(result.length() == 0) result = num.substring(i-2, i+1);
                else result = result.charAt(0) > num.charAt(i)? result: num.substring(i-2, i+1);
            }
        }
        return result;
    }
}