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
    LinkedList<TreeNode>q=new LinkedList<>();
    List<Integer>l=new ArrayList<>();
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        level(root);
        return ans;
    }
    public void level(TreeNode root)
    {
        TreeNode p=root;
        if(p==null)return;
        q.addLast(p);
        while(q.isEmpty()==false)
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                p=q.removeFirst();
                l.add(p.val);
                if(p.left!=null)q.addLast(p.left);
                if(p.right!=null)q.addLast(p.right);
            }
            ans.add(l);
            l=new ArrayList<>();
        }

    }
}