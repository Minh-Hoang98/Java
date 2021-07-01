package tree;

public class Tree {

    static class Node {

        int info;
        Node left, right;

        public Node() {
        }

        public Node(int info, Node left, Node right) {
            this.info = info;
            this.left = left;
            this.right = right;
        }

        public Node(int info) {
            this(info, null, null);
        }
    }

    Node root;

    Tree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    public void visit(Node p) {
        System.out.println(p.info + " ");
    }

    public Node searchNode(Node p, int info) {
        if (p == null) {
            return null;
        }
        if (p.info == info) {
            return p;
        } else if (info < p.info) {
            return searchNode(p.left, info);
        } else {
            return searchNode(p.right, info);
        }
    }

    public Node search(int info) {
        Node p = root;
        return searchNode(p, info);
    }

    public void insert(int info) {
        if (root == null) {
            root = new Node(info);
            return;
        }
        Node p, q;
        p = root;
        q = null;
        while (p != null) {
            if (p.info == info) {
                System.out.println(" The key " + info + " already exists, no insertion");
                return;
            }
            q = p;
            if (info < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (info < q.info) {
            q.left = new Node(info);
        } else {
            q.right = new Node(info);
        }
    }

    public void breadth() {
        if (root == null) {
            return;
        }
        Queue queue = new Queue();
        queue.enqueue(root);
        Node p;
        while (!queue.isEmpty()) {
            p = (Node) queue.dequeue();
            if (p.left != null) {
                queue.enqueue(p.left);
            }
            if (p.right != null) {
                queue.enqueue(p.right);
            }
            visit(p);
        }
    }

    public void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    public void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    public void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    public int countNode(Node p) {
        int count = 1;
        if (p.left != null) {
            count += countNode(p.left);
        }
        if (p.right != null) {
            count += countNode(p.right);
        }
        return count;
    }

    public int count() {
        if (root != null) {
            return countNode(root);
        }
        return 0;
    }

    public Node minNode(Node p) {
        if (p.left == null) {
            return p;
        }
        return minNode(p.left);
    }

    public Node maxNode(Node p) {
        if (p.right == null) {
            return p;
        }
        return maxNode(p.right);
    }

    public Node deleteNode(Node p, int x) {
        if (p == null) {
            return null;
        }
        if (p.info > x) {
            return deleteNode(p.left, x);
        } else if (p.info < x) {
            return deleteNode(p.right, x);
        } else {
            if (p.left != null && p.right != null) {
                Node q = maxNode(p.left);
                q.right = p.right;
                p = p.left;
            } else if (p.left == null) {
                p = p.right;
            } else if (p.right == null) {
                p = p.left;
            } else {
                p = null;
            }
            return p;
        }
    }

    public void delete(int info) {
        Node p = deleteNode(root, info);
        if (p == null) {
            System.out.println(info + " doesn't exist.");
        } else {
            System.out.println("Delete successfully.");
        }
    }

    public Node min() {
        return minNode(root);
    }

    public Node max() {
        return maxNode(root);
    }

    public int sumNode(Node p) {
        int sum = p.info;
        if (p.left != null) {
            sum += sumNode(p.left);
        }
        if (p.right != null) {
            sum += sumNode(p.right);
        }
        return sum;
    }

    public int sum() {
        return sumNode(root);
    }

    public int avg() {
        return sum() / count();
    }

    public static int height(Node p) {
        if (p == null) {
            return 0;
        }
        int leftHeight = height(p.left);
        int rightHeight = height(p.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }

    }

    public static int maxPath(Node p) {
        if (p == null) {
            return 0;
        }
        int sum = p.info;
        int leftSum = maxPath(p.left);
        int rightSum = maxPath(p.right);
        if (leftSum > rightSum) {
            return sum += leftSum;
        } else {
            return sum += rightSum;
        }
    }

    public static int minPath(Node p) {
        if (p == null) {
            return 0;
        }
        int sum = p.info;
        int leftSum = Integer.MAX_VALUE;
        int rightSum = Integer.MAX_VALUE;
        if (p.right == null && p.left == null) {
            return sum;
        } else {
            if (p.left != null) {
                leftSum = minPath(p.left);
            }
            if (p.right != null) {
                rightSum = minPath(p.right);
            }

            if (leftSum < rightSum) {
                sum += leftSum;
            } else {
                sum += rightSum;
            }
        }
        return sum;
    }

    public static boolean AVL(Node p) {
        if (p == null) {
            return false;
        }
        if (Math.abs(height(p.left) - height(p.right)) > 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Tree tree = new Tree();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.left.right = new Node(11);
        tree.root.left.right.right = new Node(12);

        tree.root.right = new Node(18);
        tree.root.right.right = new Node(20);
        tree.root.right.left = new Node(17);

        System.out.println(height(tree.root));
        System.out.println(maxPath(tree.root));
    }

}
