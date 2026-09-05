class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int max = 0;
        if(n==1){
            return arr[0];
        }
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<=n;i++){
            int curr = (i==n) ? 0 : arr[i];
            //System.out.println("CURR: " + curr);
        while(!stack.isEmpty() && curr< arr[stack.peek()]){
            int k = stack.pop();
            int width = stack.isEmpty()? i : i-stack.peek() -1;
            max = Math.max(max,arr[k]*width);
        }
        stack.push(i);
    }
        return max;
    }
}