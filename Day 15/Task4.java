class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.left = this.right = null;
        this.data = data;
    }
}

class Task4 {
    TreeNode root;

    Task4() {
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

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void inorderTraversal() {
        System.out.print("In-order Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }

    public static void main (String[] args) {
        Task4 bst = new Task4();
        bst.insert(50);
        bst.insert(50);
        bst.insert(70);
        bst.inorderTraversal();
    }
}