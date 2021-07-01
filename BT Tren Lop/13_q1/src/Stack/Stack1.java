package Stack;

public class Stack1 {

    class Person {

        String name;
        int age;

        Person(String xName, int xAge) {
            name = xName;
            age = xAge;
        }

        public String toString() {
            return (name + " " + age);
        }
    }

    class Node {

        Person info;
        Node next;

        Node(Person x, Node p) {
            info = x;
            next = p;
        }
    }

    Node head;

    Stack1() {
        head = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void push(Person x) {
        Node q = new Node(x, head);
        if (isEmpty()) {
            head = q;
            return;
        }
        head = q;
    }

    void pushMany(String[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            push(new Person(a[i], b[i]));
        }
    }

    void popAll() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

    Person pop() {
        if (isEmpty()) {
            return (null);
        }
        Person x = head.info;
        head = head.next;
        return (x);
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print("  " + p.info);
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"An", "Binh", "Lan", "Ngoc", "Trung"};
        int[] b = {25, 17, 26, 19, 23};
        Stack1 t = new Stack1();

        t.pushMany(a, b);
        System.out.println();
        System.out.println(t.isEmpty());
        t.pop();
        t.traverse();
    }
}
