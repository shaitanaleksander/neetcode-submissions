class Solution {
    public int numUniqueEmails(String[] emails) {

        Map<String,List<String>> collector = new HashMap<>();
        int counter = 0;

        for(String email: emails){
            String clear = email.split("@")[0].split("\\+")[0].replace(".","");
            String domain = email.split("@")[1];
            List<String> domains = collector.computeIfAbsent(clear, k -> new ArrayList<>());
            
            if(!domains.contains(domain)) {
                domains.add(domain);
                counter++;
            }

        }
        System.out.println(collector);
        return counter;
    }
}