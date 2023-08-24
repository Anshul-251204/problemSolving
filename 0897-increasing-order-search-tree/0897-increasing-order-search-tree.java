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

    
    public static void  inOrder(ArrayList<Integer> list ,TreeNode root){
        if(root == null) return ;
        
        inOrder(list , root.left);
        list.add(root.val);
        inOrder(list, root.right);
        
    }

    public TreeNode increasingBST(TreeNode root) {
    
        ArrayList<Integer> list = new ArrayList<>();
        
        inOrder( list , root);
        
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        
        for(int i=0; i<=list.size()-1; i++){
            cur.right = new TreeNode(list.get(i));
            cur = cur.right;
        }
        
        
        return ans.right; 
        
    }
}