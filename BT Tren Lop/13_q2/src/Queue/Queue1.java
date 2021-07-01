package Queue;

public class Queue1 {

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

        Node(Person x) {
            this(x, null);
        }
    }
    Node head, tail;

    Queue1() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void enqueue(Person x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    void enqueueMany(String[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            enqueue(new Person(a[i], b[i]));
        }
    }

    void dequeueAll() {
        while (!isEmpty()) {
            System.out.println(dequeue());
        }
    }

    Person dequeue() {
        if (isEmpty()) {
            return (null);
        }
        Person x = head.info;
        head = head.next;
        return (x);
    }

    public void clear() {
        head = tail = null;
    }

    public static void main(String[] args) {
        String[] a = {"An", "Binh", "Lan", "Ngoc", "Trung"};
        int[] b = {25, 17, 26, 19, 23};
        Queue1 t = new Queue1();

        t.enqueueMany(a, b);
        t.dequeueAll();
        System.out.println();
        t.clear();
        System.out.println("After clear!!");
        t.enqueueMany(a,b);
        System.out.println("=================");       
    }
}
