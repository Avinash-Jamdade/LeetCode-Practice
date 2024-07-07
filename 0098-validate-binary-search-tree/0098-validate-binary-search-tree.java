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
// public class Solution {
//     public boolean isValidBST(TreeNode root) {
//         return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//     }
    
//     public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
//         if (root == null) return true;
//         if (root.val >= maxVal || root.val <= minVal) return false;
//         return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
//     }
// }
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public boolean helper(TreeNode node, Integer low,Integer high){
        if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }
        if(high != null && node.val >= high){
            return false;
        }
        boolean leftTree=helper(node.left,low,node.val);
        boolean rightTree=helper(node.right,node.val,high);
        return leftTree && rightTree;
    }
}