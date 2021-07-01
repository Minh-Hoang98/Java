/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxpayer;

/**
 *
 * @author PC
 */
class NodeT {

    Taxpayer info;
    NodeT next;

    NodeT(Taxpayer x, NodeT p) {
        info = x;
        next = p;
    }

    NodeT(Taxpayer x) {
        this(x, null);
    }
}

public class TaxpayerList {

    NodeT head, tail;

    TaxpayerList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    void add(Taxpayer p) {
        NodeT q = new NodeT(p);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    void traverse() {
        {
            NodeT p = head;
            while (p != null) {
                System.out.println(p.info);
                p = p.next;
            }
        }
    }
//take size

    int size() {
        int size = 1;
        if (isEmpty()) {
            return 0;
        }
        NodeT current = head;
        while (current != tail) {
            size++;
            current = current.next;
        }
        return size;
    }

//search
    NodeT search(String id) {
        NodeT p = head;

        while (p != null) {
            if (p.info.code.equals(id)) {
                return p;
            }
            p = p.next;
        }
        return p;
    }

    ///delete node  follow code
    void dele(String Code) {
        NodeT q = search(Code);
        dele(q);
    }

    void deletePosition(int k) {
        NodeT x = getNode(k - 1);
        NodeT y = getNode(k + 1);
        x.next = y;

    }

    void dele(NodeT q) {
        if (q == null || isEmpty()) {
            return;
        }
        NodeT f, p;
        f = null;
        p = head;
        while (p != null) {
            if (p == q) {
                break;
            }
            f = p;
            p = p.next;
        }
        if (p == null) {
            return;
        }
        if (f == null)//q=head 
        {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        f.next = p.next;
        if (f.next == null) {
            tail = f;
        }
    }

    void deleAfter(String Code) {
        NodeT q = search(Code);
        dele(q.next);
    }

     //add in position k 
    NodeT getNode(int i) {
        NodeT p = head;
        if (isEmpty()) {
            return null;
        } else {
            while (i != 0) {
                i--;
                p = p.next;
            }
        }
        return p;
    }

    void addPosition(int k, Taxpayer p) {
        NodeT x = getNode(k - 1);
        NodeT add = new NodeT(p);
        add.next = x.next;
        x.next = add;
    }
//sort follow tax

    void sort(TaxpayerList a) {
        NodeT pi, pj;
        Taxpayer t;
        pi = a.head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pj.info.tax < pi.info.tax) {
                    t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }
}
