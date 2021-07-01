package Binary_Tree;
//Binary Search Trees

public class BSTree1 {

    static class Node {

        int info;
        Node left, right;

        Node(int x) {
            info = x;
            left = right = null;
        }
    }
    Node root;

    BSTree1() {
        root = null;
    }

    //Searching on Binary Search Trees
    Node search(Node p, int x) {
        if (p == null) {
            return (null);
        }

        if (p.info == x) {
            return (p);
        } else if (x < p.info) {
            return (search(p.left, x));
        } else {
            return (search(p.right, x));
        }
    }
    

    public void insert(int x) {
        if (root == null) {
            root = new Node(x);
            return;
        }
        Node f, p;
        p = root;
        f = null;
        while (p != null) {
            if (p.info == x) {
                System.out.println("The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (x < f.info) {
            f.left = new Node(x);
        } else {
            f.right = new Node(x);
        }
    }

    public int findMin(Node p){
    if(p.left != null){
        findMin(p.left);
    }           
    return (p.info);
}
    public int findMax(Node p){
    if(p.right != null){
        findMin(p.right);
    }           
    return (p.info);
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
        BSTree1 tree = new BSTree1();
        tree.root = new Node(50);
        tree.root.left = new Node(31);        
        tree.root.left.left = new Node(19);
        tree.root.left.right = new Node(45);
        tree.root.left.left.left = new Node(15);
        tree.root.left.left.left.left = new Node(11);
        tree.root.left.left.right = new Node(22);
        tree.root.left.left.right.right = new Node(27);
        tree.root.right = new Node(56);
        tree.root.right.right = new Node(70);
       

        tree.insert(46);
        tree.insert(54);       

        if (tree.search(tree.root, 46) == null) {
            System.out.println("\nNot Found in Tree!!!");
        } else {
            System.out.println("\nFound in Tree!!!");
        }
        
        tree.insert(45);
        
        System.out.println("\nPre-order traversal of binary tree is: ");
        tree.preOrder(tree.root);
        
        int a = tree.findMin(tree.root);
        int b = tree.findMax(tree.root);
        System.out.println(a);
        System.out.println("");
        System.out.println(b);
        
//        System.out.println("\nIn-order traversal of binary tree is:");
//        tree.inOrder(tree.root);
//        
//        System.out.println("\nPost-order traversal of binary tree is:");
//        tree.postOrder(tree.root);
    }
}
