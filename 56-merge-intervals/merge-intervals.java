class Solution {
    public int[][] merge(int[][] intervals) {
        //Sort the intervals according the start of the interval. 
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        //A list to store the array
        List<int[]> res = new ArrayList<>();
        // consider first interval values as start and end.
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            //OVERLAP
            if(intervals[i][0]<=end){
                end = Math.max(end, intervals[i][1]);
            }
            //NO OVERLAP
            else{
                res.add(new int[] {start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // Add last interval
         res.add(new int[] {start,end});
         return res.toArray(new int[res.size()][]);
    }
}