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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        boolean flag = false;
        
        q.add(root);
          
       if(root == null) return arr;
        
        while(!q.isEmpty()){
            List<Integer> lis = new ArrayList<>();
            
            int count = q.size();
            
            for(int i = 0; i< count ;i++){
                
                TreeNode curr = q.remove();
                
                lis.add(curr.val);
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            
            if(flag){
                Collections.reverse(lis);
            }
            flag = !flag;
        
             arr.add(lis);   
               
            
        }
        return arr;
        
    }
}