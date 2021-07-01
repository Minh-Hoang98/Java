package Tree;

import java.util.EmptyStackException;

public class Queue {
    class Node{
        Node next;
        Tree.Node info;

        public Node(Tree.Node info, Node next) {
            this.info = info;
            this.next = next;
        }

        public Node(Tree.Node info) {
            this(info,null);
        }
    }
    Node head, tail;
    Queue(){
        head = tail = null;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void enqueue(Tree.Node info){
        Node q = new Node(info);
        if(isEmpty()){
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }
    
    Tree.Node dequeue(){
        Node q = head;
        if(isEmpty()){
            throw new EmptyStackException();
        }
        head = head.next;
        return q.info;
    }
}

