public class Day77 {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Helper method
    public static boolean helper(TreeNode root, int val) {
        if (root == null) {
            return true;
        }

        if (root.val != val) {
            return false;
        }

        boolean leftAns = helper(root.left, val);
        boolean rightAns = helper(root.right, val);

        return leftAns && rightAns;
    }

    // Main logic
    public static boolean isUnivalTree(TreeNode root) {
        return helper(root, root.val);
    }

    // main method (VS Code run)
    public static void main(String[] args) {

        // Example 1: [1,1,1,1,1,null,1]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        System.out.println(isUnivalTree(root)); // true
    }
}
