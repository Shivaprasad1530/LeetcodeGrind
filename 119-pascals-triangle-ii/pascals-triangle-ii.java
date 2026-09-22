class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> main = new ArrayList<>();
        main.add(new ArrayList<>());
        main.get(0).add(1);
       
         for(int i=1;i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = main.get(i-1);
            curr.add(1);
            for(int j=1;j<i;j++){
                int n = prev.get(j-1) + prev.get(j); 
                curr.add(n);
            }
            curr.add(1);
            main.add(curr);
        }
        return main.get(rowIndex);
    }
}