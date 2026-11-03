class TwoSum {

    private List<Integer> list = new ArrayList<>();
    private Set<Integer> set = new HashSet<>();

    public TwoSum() {}
    public void add(int number) {

        for(int i: list) set.add(i + number);
        list.add(number);

    }
    public boolean find(int value) {return set.contains(value);}
}
