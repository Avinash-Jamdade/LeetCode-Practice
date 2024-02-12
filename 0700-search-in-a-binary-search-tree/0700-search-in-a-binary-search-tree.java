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
    public TreeNode searchBST(TreeNode root, int val) {
         if(root == null){
             return null;
         }
        if(root.val == val){
            return root;
        }
        else if(root.val > val){
            return searchBST(root.left,val);
        }
        else{
             return searchBST(root.right,val);
        }
    }
}
/**
class Solution {
public:
    TreeNode* ans = NULL;
    TreeNode* searchBST(TreeNode* root, int val) {
        if(root == NULL){
            return NULL;
        }
        if(root->val == val){
            return root;
        }
        else if(root->val > val){
            ans = searchBST(root->left,val);
        }
        else{
            ans = searchBST(root->right,val);
        }
        return ans;

    }
};
*/