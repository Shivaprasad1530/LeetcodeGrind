/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainList = new LinkedList<>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if(root == null){
            return new ArrayList<>();
        }
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int size = que.size();
            for(int i=0;i<size;i++){
                if(que.peek().left!=null){
                    que.offer(que.peek().left);
                }
                if(que.peek().right!=null){
                    que.offer(que.peek().right);
                }
                list.add(que.poll().val);
            }
            mainList.add(list);
        }
        return mainList;
    }
}