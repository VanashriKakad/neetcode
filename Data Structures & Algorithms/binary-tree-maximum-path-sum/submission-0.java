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

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        findMax(root);
        return maxSum;
    }

    public int findMax(TreeNode root){
        
        if(root == null){
            return 0;
        }


        int leftSum = Math.max(0,findMax(root.left));
        int rightSum = Math.max(0,findMax(root.right));


        int currSum = leftSum + rightSum + root.val;
        int sum = Math.max(leftSum,rightSum)+root.val;

        maxSum = Math.max(maxSum, Math.max(currSum,sum));

        return sum;

    }
}
