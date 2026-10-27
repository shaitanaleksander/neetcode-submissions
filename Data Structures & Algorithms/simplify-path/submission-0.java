class Solution {
    public String simplifyPath(String path) {

      Deque<String> stack = new ArrayDeque<>();

      String[] folders = path.split("/");

      for(String f : folders){

        if(f.equals("..")){
            if(!stack.isEmpty()) stack.pop();
        } 
        else if(f.isEmpty() || f.equals(".")){}
        else stack.push(f);
      }

    
    String result = "";

    while(!stack.isEmpty()){

        result = "/"+ stack.pop() + result;
    }
    return result.isEmpty()? "/" : result;
    }

   
}