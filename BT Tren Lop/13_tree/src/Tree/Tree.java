package Tree;

public class Tree {

    static class Node{
        int info;
        Node left, right;

        public Node() {
        }

        public Node(int info, Node left, Node right) {
            this.info = info;
            this.left = left;
            this.right = right;
        }
        
        public Node(int info){
            this(info,null,null);
        }
    }
    
    Node root;
    Tree(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    
    public void clear(){
        root = null;
    }
    
    static void visit(Node p) {
        System.out.print(p.info + " ");
    }
    public Node searchNode(Node p, int info){
        if (p == null) {
            return null;
        }
        if (p.info == info)
            return p;
        else if (info < p.info)
            return searchNode(p.left, info);
        else
            return searchNode(p.right, info);
    }
    public Node search(int info){
        Node p = root;
        return searchNode(p,info);
    }
    
    public void insert(int info){
        if (root == null) {
            root = new Node(info);
            return;
        }
        Node p, q;
        p = root;
        q = null;
        while (p != null) {
            if (p.info == info) {
                System.out.println("The key " + info + " already exists, no insertion");
                return;
            }
            q = p;
            if (info < p.info)
                p = p.left;
            else
                p = p.right;
        }
        if (info < q.info)
            q.left = new Node(info);
        else
            q.right = new Node(info);
    }
    
    public void breadth(){
        if(root == null)
            return;
        Queue queue = new Queue();
        queue.enqueue(root);
        Node p;
        while(!queue.isEmpty()){
            p = (Node) queue.dequeue();
            if(p.left != null)
                queue.enqueue(p.left);
            if(p.right != null)
                queue.enqueue(p.right);
            visit(p);
        }
    }
    
    public void preOrder(Node p){
        if (p == null)
            return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    public void inOrder(Node p) {
        if (p == null)
            return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    public void postOrder(Node p) {
        if (p == null)
            return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    Node min() {
        Node p = root;
        if (root == null) {
            System.out.println("The tree is empty.");
            return null;
        }
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }
    Node max() {
        Node p = root;
        if (root == null) {
            System.out.println("The tree is empty.");
            return null;
        }
        while (p.right != null) {
            p = p.right;
        }
        return p;
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
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
        
        System.out.println("Level order: ");
        tree.breadth();                    
        System.out.println("");
        
        System.out.println("Tree is empty: "+tree.isEmpty());
        
        tree.insert(46);
        tree.insert(54);       

        if (tree.search(46) == null) {
            System.out.println("\nNot Found in Tree!!!");
        } else {
            System.out.println("\nFound in Tree!!!");
        }        
        if (tree.search(10) == null) {
            System.out.println("\nNot Found in Tree!!!");
        } else {
            System.out.println("\nFound in Tree!!!");
        }      
        tree.insert(45);        
        System.out.println("\nPre-order traversal of binary tree is: ");
        tree.preOrder(tree.root);
        
        System.out.println("\nIn-order traversal of binary tree is:");
        tree.inOrder(tree.root);
        
        System.out.println("\nPost-order traversal of binary tree is:");
        tree.postOrder(tree.root);
        
        Node min=tree.min();
        Node max=tree.max();
        System.out.println("");
        System.out.print("Min = ");
        visit(min);
        System.out.println("");
        System.out.print("Max = ");
        visit(max);
        System.out.println("");
        
        
}
}
