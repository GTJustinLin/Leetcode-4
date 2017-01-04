/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null){
            if(right == null) return true;
            else return false;
        }else{
            if(right == null) return false;
            else{
                if(left.val != right.val) return false;
                else{
                    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
                }
            }
        }
    }
}