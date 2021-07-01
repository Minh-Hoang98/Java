package Binary_Tree;

public class BinTree_DepthFirstTraversal {

    static class Node {

        int info;
        Node left, right;

        Node(int x) {
            info = x;
            left = right = null;
        }
    }
    Node root;

    BinTree_DepthFirstTraversal() {
        root = null;
    }

    static void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    static void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    static void visit(Node p) {
        System.out.print(p.info + " ");
    }

    public static void main(String args[]) {
        BinTree_DepthFirstTraversal tree = new BinTree_DepthFirstTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nPre-order traversal of binary tree is: ");
        tree.preOrder(tree.root);
        
        System.out.println("\nIn-order traversal of binary tree is:");
        tree.inOrder(tree.root);
        
        System.out.println("\nPost-order traversal of binary tree is:");
        tree.postOrder(tree.root);
    }
}
