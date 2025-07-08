class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.left = this.right = null;
        this.data = data;
    }
}

class BinarySeachTree {
    TreeNode root;

    BinarySeachTree() {
        this.root = null;
    }

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }
}