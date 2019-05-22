package com.tech.queue;

import javax.xml.soap.Node;

public class LinckedQueue<E> implements Queue<E> {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    @Override
    public void enQueue(E e) {
        Node newNode = new Node(e,null);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E deQueue() {
        if(isEmpty()){
            System.err.println("栈已空");
            return null;
        }
        E temp = head.data;
        head.data = null;
        head = head.next;
        size--;
        return temp;
    }

    @Override
    public E peek() {
        Object temp = head.data;
        return (E)temp;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
