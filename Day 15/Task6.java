class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.left = this.right = null;
        this.data = data;
    }
}

class Task6 {
    TreeNode root;

    Task6() {
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

    public boolean search(int data) {
        TreeNode current = root;
        while (current != null) {
            if (data == current.data)
                return true;
            else if (data < current.data)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    public void delete(int data) {
        root = deleteRec(root, data);
    } 

    public TreeNode deleteRec(TreeNode root, int data) {
        // Return if the tree is empty
        if (root == null) 
            return root;
        // Find the node to be deleted
        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
        }
        return root;
    }

    public static void main (String[] args) {
        Task6 bst = new Task6();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        bst.inorderTraversal();
        bst.delete(60);
        System.out.println(bst.search(20));
        bst.inorderTraversal();
    }
}