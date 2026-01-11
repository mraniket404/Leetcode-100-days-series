class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Day78 {

    // LeetCode logic
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftAns = countNodes(root.left);
        int rightAns = countNodes(root.right);
        return leftAns + rightAns + 1;
    }

    // Main method for VS Code
    public static void main(String[] args) {
       

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Total Nodes: " + countNodes(root));
    }
}
