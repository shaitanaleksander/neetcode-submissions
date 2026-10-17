class Solution {
    public int maxDepthBST(int[] order) {

        TreeMap<Integer, Integer> depts = new TreeMap<>();
        int maxDept = 0;

        for(int i: order) {

              Integer lower = depts.lowerKey(i) == null ? 0: depts.get(depts.lowerKey(i));
              Integer hight = depts.higherKey(i)== null ? 0: depts.get(depts.higherKey(i));


            int dept = Math.max(lower, hight) + 1;

            maxDept = dept > maxDept? dept: maxDept;
            depts.put(i, dept);
        }
        return maxDept;
    }
}
