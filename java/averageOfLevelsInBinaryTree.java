import org.w3c.dom.Node;

public class averageOfLevelsInBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode (int val) {this.val = val;}   
        TreeNode (int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }   
    }
    static TreeNode root;
    
    public static void main(String[] args) {
        //BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(3);

    }
}