class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
    
    Arrays.sort(str,new Comparator<String>(){
        public int compare(String a, String b){
            String o1 = a+b;
            String o2 = b+a;
            return o2.compareTo(o1);
        }
    });

    if(str[0].equals("0")){
        return "0";
    }
    StringBuilder largest = new StringBuilder();
    for(String n : str){
        largest.append(n);
    }
    return largest.toString();
    }

}