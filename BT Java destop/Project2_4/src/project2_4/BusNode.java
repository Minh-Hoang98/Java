/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_4;

import Practical1_4.Bus;
import java.util.LinkedList;

/**
 *
 * @author PC
 */


class BSTNode {

    int info;
    BSTNode left, right;

    BSTNode(int x) {
        info = x;
        left = right = null;

    }

    BSTNode(int x, BSTNode lt, BSTNode rt) {
        this.info = x;
        left = lt;
        right = rt;
    }
}

class MyStack {

    LinkedList<Object> a;

    MyStack() {
        a = new LinkedList<Object>();
    }

    boolean isEmpty() {
        return (a.isEmpty());
    }

    void push(Object x) {
        a.add(x);
    }

    Object pop() {
        return (a.removeLast());
    }
}

class MyQueue {

    LinkedList<Object> a;

    MyQueue() {
        a = new LinkedList<Object>();
    }

    boolean isEmpty() {
        return (a.isEmpty());
    }

    void enqueue(Object x) {
        a.add(x);
    }

    Object dequeue() {
        return (a.removeFirst());
    }
}

public class BusNode {
	Bus info;
	BusNode left,right;
	BusNode(Bus x) {
		info=x;left=right=null;

	}
	BusNode(Bus x, BusNode lt, BusNode rt){
		this.info = x; left = lt; right = rt;

	}
}
