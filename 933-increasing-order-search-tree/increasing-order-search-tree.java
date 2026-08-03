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
    public List<Integer> lt = new ArrayList<>();
    public void preorder(TreeNode root){
        if(root != null){
            lt.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public TreeNode insert(int a , TreeNode root){
        if(root == null){
            return new TreeNode(a);
        }
        if(a > root.val){
            root.right = insert(a , root.right);
        }
        return root;
    }
    public TreeNode increasingBST(TreeNode root) {
        preorder(root);
        TreeNode newtree = null;
        Collections.sort(lt);
        for(int a : lt){
            newtree = insert(a , newtree);
        }
        return newtree;
    }
}